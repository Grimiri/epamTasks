package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 7. Даны действительные числа
* a_1, a_2,..,a_n. Найти max(a_1 + a_2n, a_2 + a_2n−1, ..., a_n + a_n+1).
*
* Задание не выполнено из-за неясности поставленной задачи.
* */

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random() * 10 - 5;
            System.out.print(array[i] + " | ");
        }

    }
}
