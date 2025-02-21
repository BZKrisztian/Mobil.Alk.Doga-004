package com.example.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDB {
    public Connection connect(){
        try {
            return tryConnect();
        } catch (Exception e) {
            System.err.println("Error, couldn't connect to Database. :c");
            System.err.println(e.getMessage());
            return null;
        }
    }
    public Connection tryConnect() throws SQLException{
        String user = "Szakall";
        String password = "sajtosStangli";
        String url = "jdbc:mariadb://localhost:3306/hengerszam";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }


}
