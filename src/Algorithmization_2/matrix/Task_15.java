package Algorithmization_2.matrix;

import java.util.Scanner;

/*
* 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
* */
public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("answer:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if (j % 2 != 0){
                    matrix[i][j] = max;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
