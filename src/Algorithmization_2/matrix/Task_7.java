package Algorithmization_2.matrix;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        int counter = 0;
        System.out.println("answer:\nnew matrix: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = Math.sin(Math.pow(i,2) - Math.pow(j,2) / n);
                if(matrix[i][j] > 0) counter++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("plus num count = " + counter);
    }
}
