package ProgrammingWithClasses_4.simplestclassesandobjects.Task_2;

public class Test2 {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Test2(int a, int b){
        this.a = a;
        this.b = b;

    }

    public Test2(){
        this.a = 9;
        this.b = 9;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }
}
