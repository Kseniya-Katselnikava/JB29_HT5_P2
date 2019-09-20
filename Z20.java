//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
package by.epam.jb29.task08_2;

public class Z20 {
    public static void main(String[] args) {
        int n = 10;
        int arr[][] = new int[n][n];
        int k = 1;
        int m = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i <  arr.length/2) {
                for (int j = i; j < arr[i].length - i; j++) {
                    arr[j][i] = k;
                }
            }
            else {
                for (int j = arr.length - 1 - i  ; j <= i; j++) {
                    arr[j][i] = k;
//                    m++;
                }
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

