//Создать список типа ArraList поместить в него как строки 
//так и целые числа. Пройти по списку, найти и удалить целые числа.
package Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", 3, 1));
        System.out.println(list);
        Iterator <Object> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next() instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    
}
