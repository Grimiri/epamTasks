package ProgrammingWithClasses_4.aggregationandcomposition.Task_2;

public class Engine {
    private String type;
    private int number;

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public void startEngine(){
        System.out.println("Engine: wrum-wruuum..");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
