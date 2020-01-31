package ProgrammingWithClasses_4.simplestclassesandobjects.Task_7;

import javax.crypto.spec.PSource;

/*
* 7. Описать класс, представляющий треугольник.
* Предусмотреть методы для создания объектов,
* вычисления площади,
* периметра и
* точки пересечения медиан.*/
public class Main {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(2,4);
        Point c = new Point(4,0);
        //агрегация
        Triangle triangle = new Triangle(a,b,c);

        System.out.println("triangle sides: ab = " + String.format("%.2f",triangle.getAb())
                        + " bc = " + String.format("%.2f",triangle.getBc())
                        + " ca = " + String.format("%.2f",+ triangle.getCa()));

        System.out.println("perimeter of triangle = " + String.format("%.2f",triangle.findPerimeterOfTriangle()));

        System.out.println("square of triangle = " + String.format("%.2f",triangle.findSquareOfTriangle()));

        System.out.println("medians cross of triangle = " + triangle.findPointOfMedianCross().toString());
    }
}
