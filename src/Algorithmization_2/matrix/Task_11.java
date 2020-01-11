package Algorithmization_2.matrix;

import java.util.Scanner;
/*
* 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
* которых число 5 встречается три и более раз.
* */
public class Task_11 {
    public static void main(String[] args) {
        int[][] matrix = new generationMatrixNxM().generateIntPositiveMatrix(10, 20);
        int counter = 0;
        System.out.println("answer: ");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                if(matrix[i][j] == 5){
                    counter++;
                }
            }
            if(counter >= 3){
                System.out.print(i + " ");
            }
            counter = 0;
        }

    }
}
