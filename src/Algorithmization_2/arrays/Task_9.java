package Algorithmization_2.arrays;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 *
 * */
public class Task_9 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int[] countOfArrayEquals = new int[n];
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            countOfArrayEquals[i] = counter;
            counter = 0;
        }
        int maxEquals = maxEqualsCounterPosition(countOfArrayEquals);
        System.out.println("\nanswer: ");
        for (int i = 0; i < n; i++) {
            if (countOfArrayEquals[i] == maxEquals) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int maxEqualsCounterPosition(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
