//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
package by.epam.jb29.task08_2;

public class Z7 {
    public static void main(String[] args) {
        int arr [][] = new int[5][5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*(10 + 10)) - 10;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < 0 && arr[i][j]% 2 == 0) {
                    sum += Math.abs(arr[i][j]);
                }
            }
        }
        System.out.println("Сумма модулей отрицательных нечетных элементов равна: " + sum);

    }
}
