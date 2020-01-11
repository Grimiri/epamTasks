package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
* */
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[][] matrix = new generationMatrixNxM().generateZeroMatrix(n, n);

        System.out.println("answer: \nnew matrix:");
        for(int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < n; j++){
                if(j >= i && i + j < n || j + i >= n - 1 && i >= j){
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
00 01 02 03 04 05
10 11 12 13 14 15
20 21 22 23 24 25
30 31 32 33 34 35
40 41 42 43 44 45
50 51 52 53 54 55
*/
