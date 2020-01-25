package Algorithmization_2.decomposition;

/*
 * 15. Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 * */
public class Task_15 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("answer: ");
        findAllIncNums(n);
    }


    public static boolean isIncNums(int n) {
        int temp = n / 10;
        while (temp > 0) {
            if (n % 10 > temp % 10) {
                temp /= 10;
                n /= 10;
            } else
                return false;
        }
        return true;
    }

    public static void findAllIncNums(int n) {
        for (int i = (int) (Math.pow(10, n - 1)); i < ((int) (Math.pow(10, n))) - 1; i++) {
            if (isIncNums(i))
                System.out.print(i + " ");
        }
    }
}
