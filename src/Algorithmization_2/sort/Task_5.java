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
 * [задание сформулировано не ясно, алгоритм сортировки вставками расписан не корректно - Vlad]
 * */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        /*System.out.println("enter k..");
        int k = scanner.nextInt();*/
        int[] array = new int[n];
        genSortArray(array, 0);
        /*int save = 0;
        for (int i = 1; i < n; i++) {
            save = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > save){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = save;
        }*/

        int save = 0;
        for (int i = 1; i < n; i++) {
            save = array[i];

            save = binarFind(array, array[i], 0, array.length);
        }
        System.out.println("\nanswer array: " + save);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    public static int binarFind(int[] array, int val, int start, int end) {
        int pos = 0;
        while (start <= end) {
            int cent = (start + end) / 2;
            if (val == array[cent]) {
                pos = cent;
                break;
            } else if (val < array[cent]) {
                end = cent - 1;
            } else {
                start = cent + 1;
            }
        }
        return pos;
    }

    public static void genSortArray(int[] array, int n) {
        //generate
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //sort
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
        }
        //output
        System.out.println("doesn't full sorted array:");
        for (int value : array) {
            System.out.print(value + " ");

        }
    }
}
