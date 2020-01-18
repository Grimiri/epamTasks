package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
* */
public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        sortArrayRowByMaxToMin(matrix, n);
        sortArrayRowByMinToMax(matrix, n);
    }

    public static void sortArrayRowByMaxToMin(int[][] matrix, int n){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("sorted matrix row by max to min answer: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortArrayRowByMinToMax(int[][] matrix, int n){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("sorted matrix row  by min to max answer: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
