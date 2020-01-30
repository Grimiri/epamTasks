package ProgrammingWithClasses_4.simplestclassesandobjects.Task_7;

public class Point {
    private double x;
    private double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point: " + String.format("%.2f", x) + " : " + String.format("%.2f", y);
    }
}
