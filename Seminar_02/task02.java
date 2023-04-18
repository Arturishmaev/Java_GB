package Seminar_02;

import java.util.Scanner;

//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//Вывод: a4b3cd2
public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите строку:");
        String str = sc.next();
        sc.close();

        System.out.println(compressString(str));


    }

    static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                count++;
            }
            else{
                result.append(charArray[i-1]);
                if(count != 1){
                    result.append(count);
                }
                count = 1;
            }
        }
        if (count == 1)
            result.append(charArray[charArray.length - 1]);
        else
            result.append(charArray[charArray.length - 1]).append(count);
            
        return result.toString();
    
    }}
    

