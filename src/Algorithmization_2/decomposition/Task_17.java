package Algorithmization_2.decomposition;

/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 * */
public class Task_17 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("num = " + n);
        System.out.println("answer: the count of subtractions = " + findCountOfSubtraction(n));
    }

    public static int findSumOfNums(int nums) {
        int temp = nums % 10;
        int sum = 0;
        while (nums > 0) {
            sum += temp;
            nums /= 10;
            temp = nums % 10;
        }
        return sum;
    }

    public static int findCountOfSubtraction(int n) {
        int count = 0;
        while (n != 0) {
            n -= findSumOfNums(n);
            count++;
        }
        return count;
    }
}
