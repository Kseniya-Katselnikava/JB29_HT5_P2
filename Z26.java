//С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие
//        действия:
//        а) вычислить сумму отрицательных элементов в каждой строке;
//        б) определить максимальный элемент в каждой строке;
//        в) переставить местами максимальный и минимальный элементы матрицы.
package by.epam.jb29.task08_2;

import java.util.Scanner;

public class Z26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Введите размеры массива n на m");
        System.out.print("\nn = ");
        n = sc.nextInt();
        System.out.print("\nm = ");
        m = sc.nextInt();

        int arr [][] = new int[n][m];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int sum_negative = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
               if (arr[i][j] < 0){
                   sum_negative += arr[i][j];
               }
            }
         }
        System.out.println("Сумма отрицательных цисел равна: " + sum_negative);


        for (int i = 0; i < arr.length; i++){
            int max = 0;
            for (int j = 0; j < arr[i].length - 1; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                }
            System.out.println("Ьаксимальный элемент в " + i + " строке равен: " + max);
            }

        int max = 0;
        int min = arr[0][0];
        int i_max = 0;
        int j_max = 0;
        int i_min = 0;
        int j_min = 0;

        for (int i = 0; i < arr.length; i++){
           for (int j = 0; j < arr[i].length - 1; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    i_max = i;
                    j_max = j;
                }
               if (arr[i][j] < min) {
                   min = arr[i][j];
                   i_min = i;
                   j_min = j;
               }
            }
        }

        arr [i_min][j_min] =  max;
        arr [i_max][j_max] =  min;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
