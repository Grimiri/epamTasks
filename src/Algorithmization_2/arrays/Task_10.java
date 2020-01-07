package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
* элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
* */
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 20);
            System.out.print(array[i] + " | ");
        }
        replaceArray(array);
        zipArray(array);
    }
    public static void replaceArray(int[] array){
        for (int i = 1; i < array.length; i++){
            if(i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("\nnew array: ");
        for (int value : array) {
            System.out.print(value + " | ");
        }
    }

    public static void zipArray(int[] array){
        int counter = 1;
        for(int j = 1; j < array.length - counter; j++) {
            array[j] = array[j + counter++];
            array[j + counter - 1] = 0;
        }
        System.out.println("\nnew array: ");
        for (int value : array) {
            System.out.print(value + " | ");
        }
    }
}
