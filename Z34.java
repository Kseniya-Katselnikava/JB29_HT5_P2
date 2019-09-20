//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце
//        число единиц равно номеру столбца.

package by.epam.jb29.task08_2;

public class Z34 { // Доделать
    public static void main(String[] args) {
        int m = 8;
        int n = 5;
        int arr [][] = new int[m][n];

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    arr[j][i] = (int) (Math.random() * 2);
                    if (arr[j][i] == 1) {
                        count++;
                    }
                }
                if (count != i) {
                    i--;
                }
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
