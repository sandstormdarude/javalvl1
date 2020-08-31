package homework2;

import java.io.IOException;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        Task1();
        strToInt(Task1());



    }
    private static String[] Task1() {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
            String[] arr= str.split("\n");
        return arr;
    }
    private static int[][] strToInt (String[] str) {

        int[][] a = new int [str.length][];
        for (int i = 0; i < str.length; i++) {
            a[i] = new int[str[i].length()];
            for (int j = 0; j < str[i].length(); j++)
                a[i][j] = (int)str[i].charAt(j) - 48;
        }


        return a;

    }
    private static int Task2 (int[][] str)  {
        int number = 0;
        for (int i = 0; i < str.length; i++)
            try {
            number = (int) str[i];


        } catch (ClassCastException | NullPointerException exception) {
                exception.printStackTrace();
            }
    }
     /*private int Task2 (int[][] arr){
        int number = 0;
        for (int i = 0; i < arr.length; i++)
            try {
            arr[i] = String.valueOf(Integer.parseInt(arr[i]));
            if (arr[i].valueOf(Integer.parseInt(arr[i]) / 1) != arr[i])
                throw new NullPointerException("Не число");
        } catch (NullPointerException e) {
                System.out.println("Символ не является числом");
            }
        for (int i = 0; i < arr.length; i++)
            try {
                arr[i] += number;
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        return number;
    }*/
}
