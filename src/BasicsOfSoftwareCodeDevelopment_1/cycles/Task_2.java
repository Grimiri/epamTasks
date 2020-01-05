package BasicsOfSoftwareCodeDevelopment_1.cycles;

import java.util.Scanner;
/*
*  Вычислить значения функции на отрезке [а,b] c шагом h:
* y = x, если х > 2
* y = -x, если x <= 2
* */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a..");
        double a = scanner.nextDouble();
        System.out.println("enter b");
        double b = scanner.nextDouble();
        System.out.println("enter h..");
        double h = scanner.nextDouble();
        System.out.print("answer: y = ");
        for (double i = a; i <= b; i += h){
            double y = i;
            if (i <= 2){
                y *= -1;
            }
            System.out.print(y + " ");
        }
    }
}
