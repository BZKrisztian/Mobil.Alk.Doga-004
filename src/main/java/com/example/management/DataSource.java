package com.example.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
    public static void createNumber(Numbers number) {
        try {
            tryCreateNumber(number);    
        } catch (SQLException e) {
            System.err.println("Problem, failed to get new number. :c");
            System.err.println(e.getMessage());
        }
    }
    public static void tryCreateNumber(Numbers number) throws SQLException{
        MariaDB mariadb = new MariaDB();
        Connection conn = mariadb.connect();

        String sql = 
        "insert into numbers" +
        "(radius, length, surface) values" +
        "(?, ?, ?)";
        PreparedStatement stmnt = conn.prepareStatement(sql);
        stmnt.setDouble(1, number.getRadius());
        stmnt.setDouble(2, number.getLength());
        stmnt.setDouble(3, number.getSurface());
        stmnt.execute();
    }
}
