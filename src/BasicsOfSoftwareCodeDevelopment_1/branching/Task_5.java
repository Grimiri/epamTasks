package BasicsOfSoftwareCodeDevelopment_1.branching;

import java.util.Scanner;
/*
*  Вычислить значение функции:
*  если x <= 3, тогда: x^2 - 3x + 9
*  если х > 3, тогда: 1 / x^3 + 6
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x..");
        double x = scanner.nextDouble();

        if (x <= 3){
            x = Math.pow(x,2) - 3 * x + 9;
            System.out.println("answer for x <= 3: x = " + x);
        }
        else{
            x = 1 / (Math.pow(x,3) + 6);
            System.out.println("answer for x > 3: x = " + x);
        }
    }
}
