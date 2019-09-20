//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица,
//        и вывести на экран.
package by.epam.jb29.task08_2;

import java.util.Random;

public class Z1 {
    public static void main(String[] args) {
        int arr [][] = new int[3][4];
        Random ran = new Random();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = ran.nextInt(2);
                if (arr[i][j] == 1){
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag) {
                i--;
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
