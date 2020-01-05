package BasicsOfSoftwareCodeDevelopment_1.linearprogramms;

import java.util.Scanner;
/*
* 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
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

        double z = (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));

        System.out.println("Second task answer = " + z);
    }
}
