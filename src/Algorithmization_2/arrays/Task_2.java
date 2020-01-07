package Algorithmization_2.arrays;

import java.util.Scanner;
/*
* 2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
* числом. Подсчитать количество замен.
*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("enter z (can be with ',')..");
        double z = scanner.nextDouble();
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random() * 100 - 50;
            System.out.print(array[i] + " ");
            if (array[i] > z){
                array[i] = z;
                counter++;
            }
        }
        System.out.println("\nreplacements count = " + counter);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
