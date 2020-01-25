package Algorithmization_2.decomposition;

/*
* 14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
* если сумма его цифр, возведенная в степень n, равна самому числу.
* Найти все числа Армстронга от 1 до k.
* Для решения задачи использовать декомпозицию.
* */
public class Task_14 {
    public static void main(String[] args) {
        int k = 5_500_000;
        System.out.println("answer:\n");
        findArmstrong(k);
    }

    public static int countOfNumbers(int n){
        return String.valueOf(n).length();
    }

    public static int sumOfNumbers(int n){
        int sum = 0;
        int temp = n;
        for (int i = 0; i < countOfNumbers(n); i++) {
            sum += Math.pow((temp % 10), countOfNumbers(n));
            temp /= 10;
        }
        return sum;
    }

    public static void findArmstrong(int k){
        for (int i = 1; i < k; i++) {
            if(i == sumOfNumbers(i)){
                System.out.print( i + " ");
            }
        }
    }
}
