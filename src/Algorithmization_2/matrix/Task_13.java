package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
* */
public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        sortedMatrixColByMaxtoMin(matrix, n);
        sortedMatrixColByMinToMax(matrix, n);

    }

    public static void sortedMatrixColByMaxtoMin(int[][] matrix, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if(matrix[k][i] < matrix[k + 1][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
                }
            }
        }
        System.out.println("sorted matrix column by max to min answer: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortedMatrixColByMinToMax(int[][] matrix, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n - 1; k++) {
                    if(matrix[k][i] > matrix[k + 1][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
                }
            }
        }
        System.out.println("sorted matrix column by min to max answer: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
