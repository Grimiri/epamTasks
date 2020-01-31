package ProgrammingWithClasses_4.aggregationandcomposition.Task_2;

public class Wheel {
    private String type;
    private int radius;

    Wheel(String type, int radius){
        this.type = type;
        this.radius = radius;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }

    public void changeWheel(String wheel){
        System.out.println("changed " + wheel + " wheel..");
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", radius=" + radius +
                '}';
    }
}
