package tasks.branching;

import java.util.Scanner;

/*
* 2. Найти max{min(a, b), min(c, d)}.
* */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a..");
        int a = scanner.nextInt();
        System.out.println("enter b..");
        int b = scanner.nextInt();
        System.out.println("enter c..");
        int c = scanner.nextInt();
        System.out.println("enter d..");
        int d = scanner.nextInt();
        int max = Math.max(Math.min(a,b), Math.min(c,d));
        System.out.println("max{min(a, b), min(c, d)}, max = " + max);
    }
}
