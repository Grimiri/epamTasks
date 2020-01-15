package Algorithmization_2.arrays;

/*
 * 7. Даны действительные числа
 * a_1, a_2,..,a_n. Найти max(a_1 + a_2n, a_2 + a_2n−1, ..., a_n + a_n+1).
 *
 * */

public class Task_7 {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n * 2];

        System.out.println("array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        int start = 0;
        int end = 2 * n - 1;
        int max = array[start] + array[end];
        for (start = 0; start < n; start++) {
            if (max < array[start] + array[end]) {
                max = array[start] + array[end];
            }
            end--;
        }

        System.out.println("\nanswer: " + max);
    }
}
