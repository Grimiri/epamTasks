package Algorithmization_2.decomposition;
/*
* 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
* */
public class Task_7 {
    public static void main(String[] args) {

        System.out.println(findPhactorialSum());
    }
    public static long findPhactorialSum(){
        long sum = 0;
        for (int i = 1; i <= 9 ; i++) {
            if(i % 2 != 0)
                sum += findPhactorial(i);
        }
        return sum;
    }

    public static int findPhactorial(int a){
        int ph = 1;
        for (int i = 1; i <= a; i++) {
            ph *= i;
        }
        return ph;
    }
}
