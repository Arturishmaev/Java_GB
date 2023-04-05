package Seminar_01;

import java.util.Scanner;

public class lesson_01 {
    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // int age = sc.nextInt();
        // System.out.println(age);
        // System.out.println(name);
         sc.close();
        // Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1],
        // вывести макс. кол-во подряд идущих едениц.
    //     
    //Дан массив nums = [3, 2, 2, 3] и число val = 3.
    //Если в массиве есть числа , равные заданному, нужно перенести
    // эти элементы в конец массива. Таким образом, первые несколько
    // или все элементы массива должны быть отличны от заданного
    //a остальные равны ему. Решить без доп. массива.Только перестановкой элементов.
     int[] array = new int[]{1, 3, 2, 4, 3, 5, 3, 3};
     int val = 3;
     
     for(int i = 0; i < array.length - 1; i++){
        for (int j = i + 1; j < array.length; j++) {
            if(array[i] == val){
                array[i] = array[j];
                array[j] = val;
            }
        }
        }
     for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
     }   
     }
    }
