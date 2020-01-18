package Algorithmization_2.sort;

import com.mysql.jdbc.EscapeTokenizer;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5. Сортировка вставками. Дана последовательность чисел a_1, a_2,...,a_n.
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 * Пусть a_1, a_2,...,a_n - упорядоченная последовательность,
 * т. е. a_1 <= a_2 <=...=< a_n.
 * Берется следующее число a_i+1 a и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор,
 * пока все элементы от i+1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть
 * производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 *
 * */
public class Task_5 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = new int[n];
        System.out.println("array: ");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        //отсортирован по убыванию сортировкой вставками
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && array[j - 1] < array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        System.out.println("\nmax to min sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && array[j - 1] >= array[j]; j--) {
                int save = array[binSearch(array, array[j-1])];
                array[binSearch(array, array[j-1])] = array[j-1];
                array[j-1] = save;
            }
        }
        System.out.println("\nanswer:\nmin to max sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nbin = " + binSearch(array, array[0]));
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
