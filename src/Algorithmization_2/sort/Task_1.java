package Algorithmization_2.sort;

import java.util.Scanner;
/*
* 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
* один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
* дополнительный массив
* */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first array count: n..");
        int n = scanner.nextInt();
        System.out.println("enter second array count: m..");
        int m = scanner.nextInt();
        System.out.println("enter k..");
        int k = scanner.nextInt();

        int[] firstArray = new int[n + m];
        int[] secondArray = new int[m];
        System.out.println("first array: ");
        for (int i = 0; i < n + m; i++) {
            if(i == k){
                i += m;
            }
            firstArray[i] = (int)(Math.random() * 10);
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("\nsecond array: ");
        for (int i = 0; i < m; i++) {
            secondArray[i] = (int)(Math.random() * 10);
            System.out.print(secondArray[i] + " ");
        }
        for (int i = 0, j = k; i < m; i++, j++) {
            firstArray[j] = secondArray[i];
        }
        System.out.println("\nanswer array: ");
        for (int i = 0; i < (n + m); i++) {
            System.out.print(firstArray[i] + " ");
        }

    }
}
