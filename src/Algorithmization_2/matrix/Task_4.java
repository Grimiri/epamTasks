package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int dec = 0;
        System.out.println("answer:\new matrix: ");
        for (int i = 0; i < n; i++){
            dec = n;
            System.out.print(i + ": ");
            for (int j = 0; j < n; j++){
                if (i % 2 == 0){
                    matrix[i][j] = dec--;
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print((matrix[i][j] = j + 1) + " ");
                }
            }
            System.out.println();
        }

    }
}
