//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
package by.epam.jb29.task08_2;

public class Z10 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int k = 2;
        int p = 1;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Вывод строки
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[k][i] + "\t");
        }
        System.out.println("\n");

        // Вывод столбца
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][p]);
        }
//        System.out.println();
    }
}

