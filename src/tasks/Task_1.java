package tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int a, b, c;
        float z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a..");
        a = scanner.nextInt();
        System.out.println("enter b..");
        b = scanner.nextInt();
        System.out.println("enter c..");
        c = scanner.nextInt();
        z = (float)(((a - 3) * b / 2) + c);

        System.out.println("First task answer = " + z);


    }
}
