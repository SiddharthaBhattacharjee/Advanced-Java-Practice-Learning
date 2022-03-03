package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p31_FileHandling {
    public static void main(String[] args) {
        //creating a file
        File myFile = new File("myText.txt");// Created file object
        try {
            myFile.createNewFile();// create new file
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Exists : "+myFile.isFile());// shows if file exists or not (can be pared with createNewFile() to make create if not exists condition.)

        //writing to a file
        try {
            FileWriter writer = new FileWriter("myText.txt");
            writer.write("Kenobi : Hello There! \nGrevous : General Kenobi !");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        System.out.println("Reading File "+myFile.getName()+" : ");
        try {
            Scanner sc = new Scanner(myFile);//creating scanner to read file
            while (sc.hasNextLine()){// checks if next line is there -> returns boolean
                String temp = sc.nextLine();// returns the next line -> String
                System.out.println("\t"+temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
