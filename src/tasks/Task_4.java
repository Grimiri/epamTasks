package tasks;

import java.util.Scanner;


public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter r.. ");
        float r = scanner.nextFloat();
        float ddd = Math.round(r % 1 * 1000);
        float nnn = (r - ddd / 1000) / 1000;

        r = ddd + nnn;

        System.out.println("Fourth task answer = " + r);
    }
}
