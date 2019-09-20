//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package by.epam.jb29.task08_2;

public class Z35 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10 + 10)) - 10;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length - 1; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
          }
        System.out.println("\n" + max + "\n");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
               if (arr[i][j] % 2 != 0) {
                   arr[i][j] = max;
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
