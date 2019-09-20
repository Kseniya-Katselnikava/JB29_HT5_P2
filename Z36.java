//Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
//        получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
//        Построить результат сглаживания заданной матрицы

package by.epam.jb29.task08_2;

public class Z36 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int arr1 [][] = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int sum = 0;
                for (int j1 = 0; j1 < arr[i].length; j1++) {
                    if (j1 != j) {
                      sum += arr[i][j1];
                    }
                }
                arr1[i][j] = sum;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
              System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
