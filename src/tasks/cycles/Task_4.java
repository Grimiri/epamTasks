package tasks.cycles;
/*
* 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
* */
public class Task_4 {
    public static void main(String[] args) {
        int gen = 1;
        for(int i = 1; i <= 200; i++){
            gen *= Math.pow(i,2);
        }
        System.out.println("answer: gen = " + gen);
    }
}
