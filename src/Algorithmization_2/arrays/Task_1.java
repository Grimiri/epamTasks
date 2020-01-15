package Algorithmization_2.arrays;

import java.util.Scanner;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter k..");
        int k = scanner.nextInt();
        int sum = 0;
        int counter = 0;
        int[] array = new int[10];
        System.out.print("array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % k == 0 && counter < 3) {
                sum += array[i];
                counter++;
            }
        }
        System.out.println("\nanswer: sum = " + sum);
    }
}
