package Homework6;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("text1.txt", true);
            fos.write("I'm giving you a night call to tell you how I feel".getBytes());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream("text2.txt", true);
            fos.write("I want to drive you through the night, down the hills".getBytes());
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }

    public static void glueFiles() {
        try {
            FileInputStream fis = new FileInputStream("text1.txt");
            FileInputStream fis1 = new FileInputStream("text2.txt");
            int a;
            int b;
            while ( (a = fis.read()) != -1 )
                try {
                    FileOutputStream fos = new FileOutputStream("text3.txt", true);
                    fos.write((char) a);
                    fos.flush();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();

                }
            while ( (b = fis1.read()) != -1 )
                try {
                    FileOutputStream fos1 = new FileOutputStream("text3.txt", true);
                    fos1.write((char) b);
                    fos1.flush();
                    fos1.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();

                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public static boolean searchFile(String fileName, String word) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int index = 0;
            byte[] wordBytes = word.getBytes();

            int symbol;
            do {
                symbol = fis.read();
                if (wordBytes[index] == symbol) {
                    ++index;
                    if (index == wordBytes.length) {
                        return true;
                    }
                } else {
                    index = 0;
                }
            } while (symbol != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } return false;
    }
}
