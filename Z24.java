//Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную квадратную матрицу порядка n:
package by.epam.jb29.task08_2;

public class Z24 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10 + 10)) - 10;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)Math.pow(arr[i][j], i + 1);
            }
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
             System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
