//Найти положительные элементы главной диагонали квадратной матрицы.

package by.epam.jb29.task08_2;

public class Z29 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*(10 + 10)) - 10;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nПоложительные элементы главной диагонали: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.print(arr[i][i] + "\t");
            }
        }
    }
}
