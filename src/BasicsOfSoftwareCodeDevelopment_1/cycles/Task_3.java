package BasicsOfSoftwareCodeDevelopment_1.cycles;
/*
* 3. Найти сумму квадратов первых ста чисел.
* */
public class Task_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += Math.pow(i,2);
        }
        System.out.println("answer: sum = " + sum);
    }
}
