package tasks.cycles;

import java.util.Scanner;
/*
* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
* все числа от 1 до введенного пользователем числа.
* */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any positive integer..");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum += i;
        }
        System.out.println("answer: sum = " + sum);
    }
}
