package Algorithmization_2.matrix;

import java.util.Scanner;

/*
* 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
* на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
* пользователь с клавиатуры.
* */
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        System.out.println("enter first column..");
        int a = scanner.nextInt();
        System.out.println("enter second column..");
        int b = scanner.nextInt();

        int[][] matrix = new generationMatrixNxM().generateIntMatrix(n, n);
        int[] array = new int[n];
        System.out.println("answer:\nnew matrix: ");
        for(int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < n; j++){
                if(j == a){
                    array[i] = matrix[i][j];
                    matrix[i][j] = matrix[i][b];
                    matrix[i][b] = array[i];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
