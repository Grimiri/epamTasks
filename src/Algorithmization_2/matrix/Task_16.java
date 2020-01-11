package Algorithmization_2.matrix;

import java.util.Scanner;

/*
* 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n^2
* так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
* собой. Построить такой квадрат. Пример магического квадрата порядка 3:
* 6 1 8
* 7 5 3
* 2 9 4
* */
public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter odd n > 1..");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int m = (int)(n * (Math.pow(n, 2) + 1)) / 2;
        int[] array = new int[n * n];
        System.out.println("m = " + m + "\narray: ");
        for (int i = 0; i < n * n; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[num++];
            }
        }
        System.out.println("\nanswer:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1 + ((i + j - 1 + (n - 1) / 2) % n) * n + ((i + 2 * j + 2) % n);
                if (matrix[i][j] <= 9){
                    System.out.print("0" + matrix[i][j] + " ");
                }else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
