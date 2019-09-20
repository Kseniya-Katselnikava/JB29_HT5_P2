//Найдите сумму двух матриц

package by.epam.jb29.task08_2;

public class Z38 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int arr1 [][] = new int[5][5];
        int sum [][] = new int[5][5];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10 + 10)) - 10;
                arr1[i][j] = (int)(Math.random()*(10 + 10)) - 10;
              }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < sum.length; i++){
            for (int j = 0; j < sum[i].length; j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
       }

        System.out.println("Сумма матриц равна: ");

        for (int i = 0; i < sum.length; i++){
            for (int j = 0; j < sum[i].length; j++){
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
