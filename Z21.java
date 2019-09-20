//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
package by.epam.jb29.task08_2;

public class Z21 {
    public static void main(String[] args) {
        int n = 8;
        int arr [][] = new int[n][n];

        for (int i = arr.length - 1, k = 0, m = 0; i >= 0; i--){
            k = m;
            for (int j = 0; j < arr.length - m; j++){
                arr[i][j] = ++k;
             }
            m++;
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
