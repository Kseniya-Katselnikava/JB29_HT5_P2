//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
package by.epam.jb29.task08_2;

public class Z17 {
    public static void main(String[] args) {
        int n = 8;
        int arr [][] = new int[n][n];
        int k = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j ==0 || j == arr.length - 1) {
                    arr[i][j] = k;
                }
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
