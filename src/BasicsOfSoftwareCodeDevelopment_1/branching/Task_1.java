package tasks.branching;

import java.util.Scanner;

/*
* 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
* он прямоугольным.
* */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A angle..");
        int a = scanner.nextInt();
        System.out.println("enter B angle..");
        int b = scanner.nextInt();
        if (a + b < 180) {
            if (a + b == 90) {
                System.out.println("triangle exists and C angle 90 degrees");
            }
            else {
                System.out.println("triangle exists");
            }
        }
        else {
            System.out.println("triangle does not exist");
        }

    }
}
