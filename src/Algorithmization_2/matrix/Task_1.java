package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
* */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        System.out.println("enter m..");
        int m = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, m);

        System.out.println("\nnew matrix: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0 && matrix[0][j] > matrix[n - 1][j]){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
