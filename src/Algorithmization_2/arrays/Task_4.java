package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");

        int n = scanner.nextInt();
        double[] array = new double[n];
        int maxPosition = 0;
        int minPosition = 0;

        System.out.print("array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random() * 100 - 50;
            System.out.print(array[i] + " | ");
            if(array[i] > array[maxPosition]){
                maxPosition = i;
            }
            if (array[i] < array[minPosition]){
                minPosition = i;
            }
        }

        System.out.println("\nmax = " + array[maxPosition] + " max-position = " + maxPosition
                        + "; min = " + array[minPosition] + " min-position = " + minPosition);

        double temp = array[maxPosition];
        array[maxPosition] = array[minPosition];
        array[minPosition] = temp;

        System.out.print("new array: ");
        for (double element: array) {
            System.out.print(element + " | ");
        }

    }
}
