//Заполнить список десятью случайными числами.Отсортировать список
//методом sort() и вывести его на экран.
package Seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add((random.nextInt(10,100)));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}