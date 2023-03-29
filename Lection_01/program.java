public class program {
    static public void main(String[] args) {
        System.out.println("bye world");
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456

        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        int[] arr1[] = new int[3][5];
        for (int[] line : arr1) {
        for (int item : line) {
        System.out.printf("%d ", item);
        }
        System.out.println();
    }


        int[][] arr2 = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr2[i].length; j++) {
        System.out.printf("%d ", arr2[i][j]);
        }
        System.out.println();

    }
        int a1 = 1, b = 2;
        int c = a + b;
        String res = a1 + " + " + b + " = " + c;
        System.out.println(res);

}
}

/*import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("name: ");
 String name = iScanner.nextLine();
 System.out.printf("Привет, %s!", name);
 iScanner.close();
 }
}*/

/*Создание и запись\ дозапись

import java.io.FileWriter;
import java.io.IOException;
public class Program {
 public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("file.txt", false)) {
        fw.write("line 1");
        fw.append('\n');
        fw.append('2');
        fw.append('\n');
        fw.write("line 3");
        fw.flush();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
 }
 } }*/
