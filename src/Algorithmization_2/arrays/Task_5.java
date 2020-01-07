package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("array["+ n +"]: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " | ");
        }
        System.out.println("\nanswer array: ");
        for (int i = 0; i < array.length; i++){
            if(array[i] > i){
                System.out.print(array[i] + " | ");
            }
        }
    }
}
