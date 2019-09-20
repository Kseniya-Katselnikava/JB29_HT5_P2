//Сформировать квадратную матрицу порядка N по правилу:
//     sin
//        и подсчитать количество положительных элементов в ней
package by.epam.jb29.task08_2;

public class Z23 {
    public static void main(String[] args) {
        int N = 8;
        double arr[][] = new double[N][N];
        double I = 0;
        double J;


        for (int i = 0; i < arr.length; i++) {
            J = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.toRadians(Math.sin((Math.pow(I, 2) - Math.pow(J, 2)) / N));
              J++;
            }
            I++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.3f \t", arr[i][j]);
            }
            System.out.println();
        }
    }
}
