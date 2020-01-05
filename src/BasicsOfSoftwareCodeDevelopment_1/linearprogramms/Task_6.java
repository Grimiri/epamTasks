package BasicsOfSoftwareCodeDevelopment_1.linearprogramms;

import java.util.Scanner;
/*
*  Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
* принадлежит закрашенной области, и false — в противном случае.
* */
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x.. ");
        int x = scanner.nextInt();
        System.out.println("enter y..");
        int y = scanner.nextInt();
        boolean flag = false;
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x <=2 && x >= -2 && y >= 0 && y <= 4)){
            flag = true;
            System.out.println("Sixth task answer = " + flag);
        }
        else {
            System.out.println("Sixth task answer = " + flag);
        }

    }
}
