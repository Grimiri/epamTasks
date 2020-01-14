package Algorithmization_2.sort;

import java.util.Scanner;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a_i и a_i+1.
 * Если a_i >= a_i+1 , то продвигаются на один элемент вперед.
 * Если a_i <= a_i+1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 *
 * [задание сформулированно не ясно, алгоритм Шелла расписан не корректно - Vlad]
 * */
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        genArray(array);

        boolean flag = false;
        while (!flag) {
            for (int i = 1; i < n; i++) {

            }
        }


        System.out.println("\nanswer array:");
        for (int val : array) {
            System.out.print(val + " ");
        }
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
}
