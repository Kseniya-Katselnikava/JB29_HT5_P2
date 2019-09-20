//Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных
//        чисел в ней.

package by.epam.jb29.task08_2;

public class Z31 {
    public static void main(String[] args) {
        int k = 0;
        int count = 0;

        int arr[][] = new int[50][20];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                if (arr[i][j] > 9 && arr[i][j] < 100) {
                    count ++;
                }
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nКоличество двузначных чисел равно: " + count);
    }
}
