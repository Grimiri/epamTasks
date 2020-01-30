package ProgrammingWithClasses_4.simplestclassesandobjects.Task_7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private double ab;
    private double bc;
    private double ca;

    Triangle(Point a, Point b, Point c) {
        double ab = Math.sqrt((Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)));
        double bc = Math.sqrt((Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2)));
        double ca = Math.sqrt((Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2)));

        if (canTriangleExist(ab, bc, ca)) {
            this.a = a;
            this.b = b;
            this.c = c;

            this.ab = ab;
            this.bc = bc;
            this.ca = ca;
        }
    }

    private boolean canTriangleExist(double ab, double bc, double ca) {
        if (ab + bc < ca || bc + ca < ab || ab + ca < bc) {
            System.out.println("triangle with entered params is not exist..");
            return false;
        }
        return true;

    }

    public double findPerimeterOfTriangle(){
        return ab+bc+ca;
    }

    public double findSquareOfTriangle(){
        double p = findPerimeterOfTriangle()/2;
        return Math.sqrt(p*(p - ab)*(p - bc)*(p - ca));
    }

    public double getAb() {
        return ab;
    }

    public double getBc() {
        return bc;
    }

    public double getCa() {
        return ca;
    }

    public Point findPointOfMedianCross(){
        double x = (a.getX() + b.getX() + c.getX())/3;
        double y = (a.getY() + b.getY() + c.getY())/3;;
        Point p = new Point(x, y);
        return p;
    }

}
