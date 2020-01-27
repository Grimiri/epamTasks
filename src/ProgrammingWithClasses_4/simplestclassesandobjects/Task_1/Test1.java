package ProgrammingWithClasses_4.simplestclassesandobjects.Task_1;

public class Test1 {
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

    public Test1(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }

    public int findSum(){
        return a + b;
    }

    public int findMax(){
        return Math.max(a, b);
    }
}
