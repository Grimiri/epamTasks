package Algorithmization_2.matrix;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
* 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
* */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        System.out.println("enter m..");
        int m = scanner.nextInt();
        System.out.println("enter row k..");
        int k = scanner.nextInt();
        System.out.println("enter string p..");
        int p = scanner.nextInt();

        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, m);
        System.out.println("answer: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < m; j++){
                if(i == k || p == j){
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print("--");
                }
            }
            System.out.println();
        }
    }

}
