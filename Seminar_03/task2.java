//Заполнить список названиями планет Солнечной системы в произвольном
//порядке с повторениями. Вывести название каждой планеты и количество его 
//повторений в списке.
package Seminar_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random(0);
        String [] original = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Saturn", "Jupiter", "Jupiter"};
        //ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Saturn", "Jupiter", "Jupiter"));
        ArrayList<String> planets = new ArrayList<>();
        int count = 1;
        planets.sort(null);

        for (int i = 0; i < 10; i++) {
            planets.add(original[random.nextInt(original.length)]); 
        }
        System.out.println(planets);
        
        for (int i = 1; i < planets.size(); i++) {
            if(planets.get(i) == planets.get(i - 1)){
                count++;
            }
            else{
                System.out.printf("%s - %d\n", planets.get(i - 1), count);
                count = 1;
            }
        }
    }  
}
