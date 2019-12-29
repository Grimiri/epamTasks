package tasks;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x.. ");
        int x = scanner.nextInt();
        System.out.println("enter y.. ");
        int y = scanner.nextInt();

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

        System.out.printf("Third task answer = %.4f", z);

    }
}
