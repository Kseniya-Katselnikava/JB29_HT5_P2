//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
//        в которых число 5 встречается три и более раз.

package by.epam.jb29.task08_2;

public class Z30 {
    public static void main(String[] args) {
        int k = 0;
        int count = 0;

        int arr[][] = new int[10][20];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*16);
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nНомера строк, в которых число 5 встречается три и более раза: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
             if (arr[i][j] == 5) {
                 count++;
                }
            }
            if (count > 2) {
                System.out.print(i + "\t");
            }
            count = 0;
        }
    }
}

