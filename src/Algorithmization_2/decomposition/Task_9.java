package Algorithmization_2.decomposition;
/*
* 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
* Написать метод(методы) вычисления его площади,
* если угол между сторонами длиной X и Y — прямой.
* */
public class Task_9 {
    public static void main(String[] args) {
        double x = 5, y = 5, z = 5, t = 5;

        double sideByPifagor = findSideByPifagor(x, y);

        double firstHalfSquare = findSquareByThreeSide(x, y, sideByPifagor);

        double secondHalfSquare = findSquareByThreeSide(z, t, sideByPifagor);

        double square = findSquare(firstHalfSquare, secondHalfSquare);

        System.out.println("answer: square = " + square);
    }

    public static double findSquare(double squareFirstHalf, double squareSecondHalf){
        return squareFirstHalf + squareSecondHalf;
    }

    public static double findSideByPifagor(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double findHalfPerimeter(double a, double b, double c){
        return (a + b + c)/2;
    }

    public static double findSquareByThreeSide(double a, double b, double c){
        double p = findHalfPerimeter(a, b, c);
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}
