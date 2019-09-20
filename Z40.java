//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1,
//        2, 3, ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны
//        между собой. Построить такой квадрат. Пример магического квадрата порядка 3:

package by.epam.jb29.task08_2;

public class Z40 {
    public static void main(String[] args) {
        int arr[][] = {{6, 1, 8},
                {7, 5, 3},
                {2, 9, 4}};

//        int arr[][] = {{1, 2, 3},
//                {1, 1, 3},
//                {1, 2, 3}};

        int sum = 0;
        int sum1 = 0;
        int sumD1 = 0;
        int sumD2 = 0;
        boolean res = true;


        for (int i = arr.length - 1; i >= 0; i--){
            sumD1 += arr[i][i];
        }

        for (int i = 0; i < arr.length; i++){
            sumD2 += arr[i][i];
            for (int j = 0; j < arr[i].length; j++){
                    sum += arr[i][j];
                    sum1 += arr[j][i];
                }

            if (sumD1 != sum || sumD1 != sum1) {
                res = false;
                break;
            }
            sum = 0;
            sum1 = 0;
        }

        if (sumD1 != sumD2) {
            res = false;
        }

        if (res) {
            System.out.println("Матрица является магическим квадратом");
        }
        else {
            System.out.println("Матрица не является магическим квадратом");
        }
    }
}
