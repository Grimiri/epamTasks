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
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            System.out.println();
            for (int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
