package BasicsOfSoftwareCodeDevelopment_1.branching;

import java.util.Scanner;
/*
* 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
* Определить, пройдет ли кирпич через отверстие.
* */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A side..");
//        int aSide = scanner.nextInt();
        int aSide = (int)(Math.random() * 5);
        System.out.println("enter B side..");
//        int bSide = scanner.nextInt();
        int bSide = (int)(Math.random() * 5);
        System.out.println("enter x..");
//        int x = scanner.nextInt();
        int x = (int)(Math.random() * 5);
        System.out.println("enter y..");
//        int y = scanner.nextInt();
        int y = (int)(Math.random() * 5);
        System.out.println("enter z..");
//        int z = scanner.nextInt();
        int z = (int)(Math.random() * 5);
        System.out.println("you enter: A = " + aSide + " B = " + bSide + " x = " + x + " y = " + y + " z = " + z);
        if ((aSide >= x && bSide >= y) || (aSide >= y && bSide >= z) || (aSide >= z && bSide >= x)){
            System.out.println("the brick will pass");
        }else {
            System.out.println("the brick will not pass");
        }
    }
}
