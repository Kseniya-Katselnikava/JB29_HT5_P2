//Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
//        налево, вторая строка слева направо, третья строка справа налево и так далее.
package by.epam.jb29.task08_2;

public class Z11 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i % 2 == 0) {
                    System.out.print(arr[i][arr[i].length - 1 - j] + "\t");
                }
                else {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
