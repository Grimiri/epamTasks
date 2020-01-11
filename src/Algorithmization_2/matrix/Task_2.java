package Algorithmization_2.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
* 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
* */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        System.out.println("enter m..");
        int m = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, m);
        System.out.println("answer: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < m; j++){
                if (i == j) {
                    System.out.print(matrix[i][j]);
                }
                else {
                    System.out.print("--");
                }
            }
            System.out.println();
        }
    }
}
