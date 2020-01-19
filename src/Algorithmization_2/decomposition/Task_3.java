package Algorithmization_2.decomposition;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 * */
public class Task_3 {
    public static void main(String[] args) {
        int r = 5;
        int ac = 10;
        System.out.println("answer:\nSquare = " + hexagonSquare(r, ac));
    }

    public static double hexagonSquare(int r, int ac) {
        double square = 0;
        for (int i = 0; i < 6; i++) {
            square += triangleSquare(r, ac);
        }
        return square;
    }

    public static double triangleSquare(int h, int ac) {
        return (ac / 2) * h;
    }
}
