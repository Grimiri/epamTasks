package Algorithmization_2.sort;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first array n..");
        int n = scanner.nextInt();
        System.out.println("enter second array m..");
        int m = scanner.nextInt();
        int[] arrayF = genArray(n, m);
        int[] arrayS = genArray(m, 0);

        sort(arrayF, n);
        sort(arrayS, m);

        System.out.println("first array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayF[i] + " ");
        }
        System.out.println("\nsecond array:");
        for (int i = 0; i < m; i++) {
            System.out.print(arrayS[i] + " ");
        }
        for (int i = 0, j = n; i < m; i++, j++) {
            arrayF[j] = arrayS[i];
        }
        sort(arrayF, n + m);
        System.out.println("\nanswer array:");
        for (int i = 0; i < n + m; i++) {
            System.out.print(arrayF[i] + " ");
        }




    }
    public static int[] genArray(int n, int m){
        int[] array = new int[n + m];
        for(int i = 0; i < n; i++){
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    public static void sort(int[] array, int n){
        boolean flag = false;
        while(!flag) {
            flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
        }
    }
}
