package com.example.management;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
    public ArrayList<Numbers> readFile(){
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("File could not be found. :c");
            System.err.println(e.getMessage());
            return null;
        }
    }

    private ArrayList<Numbers> tryReadFile()throws FileNotFoundException{
        ArrayList<Numbers> Numbers = new ArrayList<Numbers>();
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file, "UTF-8");
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(" <-[--]-> ");
            Numbers number = new Numbers(Integer.parseInt(lineArray[0]), Double.parseDouble(lineArray[1]), Double.parseDouble(lineArray[2]), Double.parseDouble(lineArray[3]));
            number.setId(Integer.parseInt(lineArray[0]));
            number.setRadius(Double.parseDouble(lineArray[1]));
            number.setLength(Double.parseDouble(lineArray[2]));
            number.setSurface(Double.parseDouble(lineArray[3]));
            Numbers.add(number);
        }
        scanner.close();
        return Numbers;
    }

}
