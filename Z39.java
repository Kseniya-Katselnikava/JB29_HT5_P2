//Найдите произведение двух матриц.

package by.epam.jb29.task08_2;

public class Z39 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int arr1[][] = new int[5][5];
        int proizv[][] = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10 + 10)) - 10;
                arr1[i][j] = (int) (Math.random() * (10 + 10)) - 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < proizv.length; i++) {
            for (int j = 0; j < proizv[i].length; j++) {
                proizv[i][j] = arr[i][j] * arr1[i][j];
            }
        }

        System.out.println("Произведение матриц равно: ");

        for (int i = 0; i < proizv.length; i++) {
            for (int j = 0; j < proizv[i].length; j++) {
                System.out.print(proizv[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
