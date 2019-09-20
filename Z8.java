//Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди
//        элементов массива.
package by.epam.jb29.task08_2;

public class Z8 {
    public static void main(String[] args) {
        int arr [][] = new int[6][8];
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*20);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("\nЧисло 7 встречается " + count + " раз(а)");
    }
}
