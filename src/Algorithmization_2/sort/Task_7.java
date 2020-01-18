package Algorithmization_2.sort;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел.
 * Требуется указать те места, на которые нужно вставлять элементы второй последовательности в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 * */
public class Task_7 {
    public static void main(String[] args) {
        int n = 10;
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        int[] positonArray;

        for (int i = 0; i < n; i++) {
            firstArray[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            secondArray[i] = (int) (Math.random() * 10);
        }
        sortArray(firstArray);
        sortArray(secondArray);
        positonArray = getPositions(firstArray, secondArray);

        System.out.println("first array: ");
        for (int val :
                firstArray) {
            System.out.print(val + " ");
        }
        System.out.println("\nsecond array: ");
        for (int val :
                secondArray) {
            System.out.print(val + " ");
        }
        System.out.println("\npositions array: ");
        for (int val :
                positonArray) {
            System.out.print(val + " ");
        }
    }

    public static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    public static int[] getPositions(int[] a, int[] b) {
        int[] posArray = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            posArray[i] = binSearch(a, b[i]);
        }
        return posArray;
    }

    public static int binSearch(int[] array, int val) {
        int start = 0;
        int end = array.length;
        int center = 0;
        for (int i = 0; i < array.length/2; i++) {
            center  = start + (end - start) / 2;
            if (val < array[center]) {
                end = center;
            }
            if (val > array[center]) {
                start = center + 1;
            }
            if (val == array[center] || start == end) {
                return center;
            }
        }
        return center;
    }

}
