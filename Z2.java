//Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
package by.epam.jb29.task08_2;

import java.util.Random;

public class Z2 {
    public static void main(String[] args) {
        int arr [][] = new int[2][3];
//        Random ran = new Random();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
//                arr[i][j] = ran.nextInt(10);
                arr[i][j] = (int)(Math.random()*(10));
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
