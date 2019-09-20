//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package by.epam.jb29.task08_2;

public class Z9 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int k = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i][k] + "\t");
            k++;
            }
            System.out.println();
        }
    }

