package Algorithmization_2.sort;

import java.util.Scanner;

/*
 * 3. Сортировка выбором. Дана последовательность чисел
 * a1 <= a2 <=...<= an.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 * */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        genSortArray(array);

        System.out.println("\nanswer array: ");
        int maxPositoin;
        for (int i = 0; i < array.length; i++) {
            maxPositoin = i;
            for (int j = i; j < array.length; j++) {
                if (array[maxPositoin] < array[j]) {
                    maxPositoin = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxPositoin];
            array[maxPositoin] = temp;
            System.out.print(array[i] + " ");
        }
    }

    public static void genSortArray(int[] array) {
        //generate
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //sort
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
        }
        //output
        System.out.println("array:");
        for (int value : array) {
            System.out.print(value + " ");

        }
    }
}
