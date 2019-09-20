//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//        столбец содержит максимальную сумму.

package by.epam.jb29.task08_2;

public class Z28 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[j][i];
              }
            System.out.println("Сумма " + i + " столбца равна: " + sum);
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Максимальная сумма равна: " + max);
    }
}
