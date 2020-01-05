package tasks.linearprogramms;

import java.util.Scanner;
/*
* 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
* */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a..");
        int a = scanner.nextInt();
        System.out.println("enter b..");
        int b = scanner.nextInt();
        System.out.println("enter c..");
        int c = scanner.nextInt();
        float z = (float)(((a - 3) * b / 2) + c);

        System.out.println("First task answer = " + z);


    }
}
