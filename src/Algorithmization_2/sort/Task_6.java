package Algorithmization_2.sort;

import javax.naming.PartialResultException;
import java.util.Scanner;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a_i и a_i+1.
 * Если a_i >= a_i+1 , то продвигаются на один элемент вперед.
 * Если a_i <= a_i+1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 *
 * */
public class Task_6 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        genArray(array);
        shellSort(array);
    }

    public static void genArray(int[] array) {
        //generate
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //output
        System.out.println("array:");
        for (int value : array) {
            System.out.print(value + " ");

        }
    }

    public static void shellSort(int[] array) {
        int[] retArray = new int[array.length];
        for (int i = array.length / 2; i >= 1; i /= 2) {
            for (int j = 0; j < i; j++) {
                retArray = shellStart(array, j, i);
            }
        }

        System.out.println("\nanswer: ");
        for (int val : retArray) {
            System.out.print(val + " ");

        }
    }

    public static int[] shellStart(int[] array, int start, int step) {
        int temp;
        for (int i = start; i < array.length - 1; i += step) {
            for (int j = Math.min(i + step, array.length - 1); j - step >= 0; j -= step) {
                if (array[j - step] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                } else break;
            }
        }
        return array;
    }
}
