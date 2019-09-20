//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

package by.epam.jb29.task08_2;

public class Z32 {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int buf;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10 + 10)) - 10;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int i1 = 0; i1 < arr.length - j; i1++) {
                    if (arr[i][i1] > arr[i][i1 + 1]) {
                        buf = arr[i][i1];
                        arr[i][i1] = arr[i][i1 + 1];
                        arr[i][i1 + 1] = buf;
                    }
                }
            }
        }

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int i1 = 0; i1 < arr.length - j; i1++) {
                    if (arr[i][i1] < arr[i][i1 + 1]) {
                        buf = arr[i][i1];
                        arr[i][i1] = arr[i][i1 + 1];
                        arr[i][i1 + 1] = buf;
                    }
                }
            }
        }

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
