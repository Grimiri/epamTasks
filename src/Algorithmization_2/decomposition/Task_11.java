package Algorithmization_2.decomposition;
/*
* 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
* */
public class Task_11 {
    public static void main(String[] args) {
        double a = -34.3567689;
        double b = 561.6784;
        int aCount = countOfNumbers(a);
        int bCount = countOfNumbers(b);
        if(aCount > bCount)
            System.out.println("answer: a - count of numbers = " + aCount);
        else if (aCount < bCount)
            System.out.println("answer: b - count of numbers = " + bCount);
        else
            System.out.println("answer: a = b - count of numbers = " + aCount);
    }

    public static int countOfNumbers(double num){
        num = Math.abs(num);
        String string = String.valueOf(num).replace(".", "");
        return string.length();

    }
}
