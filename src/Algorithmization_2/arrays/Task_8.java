package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 8. Дана последовательность целых чисел a_1, a_2,..., a_n. Образовать новую последовательность, выбросив из
* исходной те члены, которые равны
* min(a_1, a_2,...,a_n).
*/
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min = 0;
        int counter = 0;
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100 - 50);
            System.out.print(array[i] + " | ");
            if (min > array[i]){
                min = array[i];
            }
        }
        for (int value : array) {
            if (value == min) {
                counter++;
            }
        }
        System.out.println("\nmin = " + min + " counter = " + counter);
        int newArrayLenght = n - counter;
        int[] newArray = new int[newArrayLenght];
        int newCounter = 0;
        System.out.println("answer, new array: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] != min && newCounter != newArrayLenght ){
                newArray[newCounter] = array[i];
                System.out.print(newArray[newCounter] + " | ");
                newCounter++;
            }
        }
    }
}
