package Algorithmization_2.matrix;

import java.util.Scanner;

/*
* 10. Найти положительные элементы главной диагонали квадратной матрицы
* */
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        int[] array = new int[n];
        System.out.print("answer:\npositive main diagonal element's: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                if(i == j && matrix[i][j] >= 0){
                    array[i] = matrix [i][j];
                    System.out.print(array[i] + " ");
                }
            }
    }
}
