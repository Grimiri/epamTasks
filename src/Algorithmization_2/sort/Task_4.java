package Algorithmization_2.sort;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/*
* 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...=< an.
* Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
* a_i и a_i+1. Если a_i > a_i+1, то делается перестановка.
* Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
* Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
* */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        genSortArray(array);

        int counter = 0;
        boolean flag = false;
        while (!flag){
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                    flag = false;
                }
            }
        }

        System.out.println("\nanswer array:");
        for (int val: array) {
            System.out.print(val + " ");
        }
        System.out.println("\ncounter = " + counter);

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
