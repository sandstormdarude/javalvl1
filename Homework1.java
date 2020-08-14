package ru.geekbrains.java1.lesson1.domashka;

public class Homework1 {
    public static void main(String[] args) {
        boolean a = Task5(2040);
        System.out.println(a); //Тут тестировал работоспособность
        //Есть вопрос по методу, см. Task5



    }
    private static float Task1 (int a, int b, int c, int d) {
        float result;
        result = a * (b + (c / d));
        return result;

    }
    private static boolean Task2 (int a, int b) {
        int c;
        c = a + b;
        boolean result;
        if (c < 10 || c > 20 ) result = false;
        else result = true;
       return result;

    }
    private static String Task3 (int a) {
        if (a < 0) return ("Число отрицательное");
        else return ("Число положительное");

    }
    private static String Task4 (String Nameuser) {
        return ("Привет, " + Nameuser);

    }
    private static boolean Task5 (int a) {
        boolean e;
        int b;
        int c;
        int d;
        b = a % 4;
        c = a % 100;
        d = a % 400;
        if ((b == 0 && c != 0) || d == 0) e = true;
        else e = false;
        return e; //Рабочий метод, возвращает true и false вроде как верно, но не очень красиво, т.к. не String в итоге выводит, а boolean

        // private static String Task5 (int a) {
        //        boolean e;
        //        int b;
        //        int c;
        //        int d;
        //        b = a % 4;
        //        c = a % 100;
        //        d = a % 400;
        //        if ((b == 0 && c != 0) || d == 0) e = true;
        //                else e = false;
        //        if (e = true) return ("Год високосный");
        //        else return ("Год невисокосный");
        //
        //
        //    }
        // Здесь по идее должен возвращать "красиво", но почему-то вне зависимости от аргумента возвращает всегда "Год високосный"
        // Буду благодарен за объяснение :)


    }


}
