package Algorithmization_2.decomposition.Task_4;

/*
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 * */
public class Task_4 {
    public static void main(String[] args) {
        int n = 3;
        Point[] arrayOfPoints = new Point[n];
        System.out.println("array of points:");
        for (int i = 0; i < n; i++) {
            arrayOfPoints[i] = new Point();
            arrayOfPoints[i].setX((int) (Math.random() * 9 + 1) - 5);
            arrayOfPoints[i].setY((int) (Math.random() * 9 + 1) - 5);
            System.out.print(arrayOfPoints[i] + " ");
        }
        Point a = new Point(), b = new Point();
        double dist = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double temp = findDistance(arrayOfPoints[i], arrayOfPoints[j]);
                if (temp > dist) {
                    dist = temp;
                    a = arrayOfPoints[i];
                    b = arrayOfPoints[j];
                }
            }
        }
        System.out.println("\nanswer:\n" + a + " " + b + " distance = " + dist);
    }

    public static double findDistance(Point a, Point b) {
        return Math.abs(Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)));
    }
}
