package Algorithmization_2.matrix;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/*
* 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("answer: \nnew matrix:");
        for(int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < n; j++){
                matrix[i][j] = i + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
