package tasks.branching.Task_3;

import java.util.Scanner;
/*
* 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
* */

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point[] pointMass = new Point[3];
        for (int i = 0; i < 3; i++) {
            pointMass[i] = new Point();
            System.out.println("enter " + i + " point x and y..\n enter x..");
            pointMass[i].setX(scanner.nextInt());
            System.out.println("enter y..");
            pointMass[i].setY(scanner.nextInt());
        }
        // точки лежат на одной прямой тогда и только тогда, когда (x1−x2)(y3−y2)=(x3−x2)(y1−y2)
        //(x1−x2)(y3−y2)
        int leftNum = (pointMass[0].getX() - pointMass[1].getX()) * (pointMass[2].getY() - pointMass[1].getY());
        //(x3−x2)(y1−y2)
        int rightNum = (pointMass[2].getX() - pointMass[1].getX()) * (pointMass[0].getY() - pointMass[1].getY());
        if(leftNum == rightNum){
            System.out.println("points on one line");
        }else {
            System.out.println("points isn't on one line");
        }

    }
}
