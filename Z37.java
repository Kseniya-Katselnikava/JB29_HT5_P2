//Переставить строки матрицы случайным образом.

package by.epam.jb29.task08_2;

public class Z37 {
    public static void main(String[] args) {
      int arr [][] = new int[5][5];
      int k;
      int n;

     do {
          k = (int)(Math.random()*(arr.length));
          n = (int)(Math.random()*(arr.length));
      }  while (k == n);

//        System.out.println(k);
//        System.out.println(n + "\n");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        int arr1 [] = new int[arr.length];

        for (int i = 0; i < arr1.length; i++){
            arr1[i] =  arr[k][i];
            }

        for (int i = 0; i < arr.length; i++){
            arr[k][i] =  arr[n][i];
            arr[n][i] = arr1[i];
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


