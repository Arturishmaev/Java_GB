package Seminar_02;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        //Дано четное число N (>0) и символы c1 и c2.Написать метод,
        //Который вернет строку длины N, которая состоит из чере-
        //дующихся символов c1 и c2, начиная с c1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину строки:");
        int number = sc.nextInt();
        System.out.println("Введите первый символ:");
        String firstChar = sc.next();
        System.out.println("Введите второй символ:");
        String secondChar = sc.next();
        sc.close();
     
        System.out.println(str(number, firstChar, secondChar));


    }
    static String str (int number, String firstChar, String secondChar){
        StringBuilder result = new StringBuilder();
        String twoChars = firstChar + secondChar;
        for (int i = 0; i < number/2; i++) {
            result.append(twoChars);
        }
        return result.toString();

    }
}
