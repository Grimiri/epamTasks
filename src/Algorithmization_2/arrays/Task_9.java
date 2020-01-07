package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
* чисел несколько, то определить наименьшее из них.
*
* не доделана проверка на случай, если таких чисел - несколько
* */
public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] countArray = new int[n];
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10 - 5);
            System.out.print(array[i] + " | ");
        }
        int num = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            int counterFunc = countOfEquals(array[i], array);
            if (counterFunc > counter){
                counter = counterFunc;
                num = array[i];
            }
        }
        System.out.println("\nanswer: " + num);

    }

    public static int countOfEquals(int num, int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (num == array[i]){
                counter++;
            }
        }
        return counter;
    }
}
