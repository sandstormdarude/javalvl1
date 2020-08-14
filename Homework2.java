import java.sql.SQLOutput;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, a = arr[i].length - 1; j < arr[i].length; j++, a--) {
                if (i == j || i == a) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


    private static void Task1() {
        int[] ar1 = {1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] == 1) ar1[i] = 0;
            else ar1[i] = 1;

        }
    }


    private static void Task2() {
        int[] arr = new int[8];
        int a = 1;
        for (int i = 0; i < arr.length; i++, a = a + 3) {
            arr[i] = a;

        }
    }

    private static void Task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
    }

    private static void Task4() {
        int[] arr = {2, 3, 7, 19, 56, 21, 4, 9, 11};
        int b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < b) b = arr[i]; //для поиска большего if (arr[i] > j) j = arr[i]
            System.out.println(b);
        }
    }

    private static void Task5() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, a = arr[i].length - 1; j < arr[i].length; j++, a--) {
                if (i == j || i == a) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean Task6() {
        int[] arr = {1, 4, 5, 7, 2, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            int sum1 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += arr[j];
            }
            int sum2 = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                return true;

            }
        }
        return false;
    }
    }
