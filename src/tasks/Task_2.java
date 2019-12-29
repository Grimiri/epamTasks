package tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int a, b, c;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a..");
        a = scanner.nextInt();
        System.out.println("enter b..");
        b = scanner.nextInt();
        System.out.println("enter c..");
        c = scanner.nextInt();

        z = (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.println("Second task answer = " + z);
    }
}
