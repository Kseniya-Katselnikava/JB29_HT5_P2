//Дана матрица. Вывести на экран первый и последний столбцы.
package by.epam.jb29.task08_2;

import java.util.Random;

public class Z3 {
    public static void main(String[] args) {
        int arr[][] = new int[5][8];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ran.nextInt(20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j += arr[i].length - 1) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }
}


