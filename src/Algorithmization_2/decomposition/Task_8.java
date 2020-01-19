package Algorithmization_2.decomposition;
/*
* 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[5] +D[6] +D[7].
* Пояснение. Составить метод(методы) для вычисления суммы трех
* последовательно расположенных элементов массива с номерами от k до m.
* */
public class Task_8 {
    public static void main(String[] args) {
        int n = 10;
        int k = 0;
        int m = 9;
        int[] array = genArray(n);
        System.out.println("array:");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\nanswer: ");
        int sum = 0;
        for (int i = k; i < n && i < m; i += 3) {
            System.out.print(sumOfThree(array, i, m) + " ");
        }
    }

    public static int[] genArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*9 + 1);
        }
        return array;
    }

    public static int sumOfThree(int[] array, int start, int end){
        int sum = 0;
        for (int i = start; i < start + 3 && i < array.length && i < end ; i++) {
            sum += array[i];
        }
        return sum;
    }
}
