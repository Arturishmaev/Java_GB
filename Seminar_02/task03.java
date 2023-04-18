package Seminar_02;

import java.util.Scanner;

//Напишите метод, который принимает на вход строку (String) и определяет
//является ли строка палиндромом(возвращает boolean значение).
public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = sc.next();
        sc.close();
        System.out.println(flag(str));

        
        
    }

    static boolean flag(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1])
                return false;
            
        }
        return true;
    }
    
}
