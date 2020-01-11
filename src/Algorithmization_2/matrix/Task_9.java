package Algorithmization_2.matrix;

import java.util.Scanner;

/*
* 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
* столбец содержит максимальную сумму.
* */
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        int[] arraySum = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arraySum[i] += matrix[j][i];
            }
        }
        int max = 0;
        System.out.print("sum: ");
        for(int i = 0; i < n; i++){
            if(arraySum[max] < arraySum[i]){
                max = i;
            }
            System.out.print(arraySum[i] + " ");
        }
        System.out.println("\nmax = " + arraySum[max] + " index of max = " + max);
    }
}
