//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца
//        поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера
//        столбцов вводит пользователь с клавиатуры.

package by.epam.jb29.task08_2;

import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int k;
        int n;
        Scanner sc = new Scanner(System.in);

       System.out.println("Введите номер столбца k больше или равен 0 и меньше " + arr.length);
        k = sc.nextInt();
        if (k >=0 && k < arr.length) {
            System.out.println("Введите номер столбца n больше или равен 0 и меньше " + arr.length + " и не равен k");
            n = sc.nextInt();

            if (n >=0 && n < arr.length && k != n) {
                for (int i = 0; i < arr.length; i++){
                    for (int j = 0; j < arr[i].length; j++){
                        arr[i][j] = (int)(Math.random()*(10));
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("\n");

                int arr1 [] = new int[arr.length];

                for (int i = 0; i < arr1.length; i++){
                    arr1[i] =  arr[i][k];
                }

                for (int i = 0; i < arr.length; i++){
                    arr[i][k] =  arr[i][n];
                    arr[i][n] = arr1[i];
                }

                for (int i = 0; i < arr.length; i++){
                    for (int j = 0; j < arr[i].length; j++){
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("Неверное значение n");
            }
        }else {
            System.out.println("Неверное значение k");
        }
    }
    }

