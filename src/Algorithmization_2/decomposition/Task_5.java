package Algorithmization_2.decomposition;

/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива,
 * но больше всех других элементов).
 * */
public class Task_5 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        System.out.println("array:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println("answer\npre Max = " + findPreMax(array));
    }

    public static int findPreMax(int[] array) {
        int preMax = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                preMax = temp;
                temp = array[i];
            }
        }
        return preMax;
    }
}
