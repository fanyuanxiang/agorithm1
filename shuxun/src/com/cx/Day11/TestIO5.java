package com.cx.Day11;

import java.io.*;

public class TestIO5 {

    public static void main(String[] args) throws IOException {
        File file = new File("Test");
        String objectPath = new String("NewFolder");
        copy(file, objectPath);

    }

    public static void copy(File file, String objectPath) throws IOException {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.listFiles() != null) {
                copy(f, objectPath);
            } else {
                if (f.getName().endsWith(".jpg")) {
                    FileWriter write = new FileWriter(new File(objectPath + "\\" + f.getName()));
                }
            }
        }
    }
}


