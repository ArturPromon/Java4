package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class writer {
    public static void main(String[] args){
        try {
            File file = new File("src/com/company/test2.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello world");
            pw.println("Hello world");
            pw.println("My name is Ivan");
            pw.close();
        }catch (IOException e){
           System.out.println("Error" + e);
        }
    }
}
