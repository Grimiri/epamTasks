package Algorithmization_2.decomposition;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел,
 * содержащих только нечетные цифры. Определить также,
 * сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 * */
public class Task_16 {
    public static void main(String[] args) {
        int n = 1;
        int sumResult = findSumOnlyOddNums(n);
        int oddResult = findAnEvenCountInSum(sumResult);
        System.out.println("\nanswer: ");
        System.out.println("sum = " + sumResult + "; count of even = " + oddResult);
    }

    public static boolean isOnlyOddNums(int nums) {
        int temp = nums % 10;
        while (temp > 0) {
            if (temp % 2 == 0)
                return false;
            nums /= 10;
            temp = nums % 10;
        }
        return true;
    }

    public static int findSumOnlyOddNums(int nums) {
        int sum = 0;
        System.out.println("nums: ");
        for (int i = (int) (Math.pow(10, nums - 1)); i < ((int) (Math.pow(10, nums)) - 1); i++) {
            if (isOnlyOddNums(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        return sum;
    }

    public static int findAnEvenCountInSum(int sum) {
        int counter = 0;
        int temp = sum;
        while (temp > 0) {
            if (temp % 2 == 0) {
                counter++;
            }
            temp /= 10;
        }
        return counter;
    }
}
