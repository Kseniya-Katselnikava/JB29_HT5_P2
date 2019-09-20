//Получить квадратную матрицу порядка n:
package by.epam.jb29.task08_2;


public class Z25 {
    public static void main(String[] args) {
        int n = 10;
        int arr[][] = new int [10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n * i + (j+1);
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
