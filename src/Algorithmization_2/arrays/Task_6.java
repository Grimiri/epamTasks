package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
* являются простыми числами.
*/
public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        double[] array = new double[n];
        double sum = 0;
        System.out.println("array: ");
        for(int i = 0; i < array.length; i++ ){
            array[i] = Math.random() * 10 - 5;
//            для удобности проверки
//            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " | ");
            if (i > 1 && checkNumForSimple(i)){
                sum += array[i];
            }
        }
        System.out.println("\nanswer: sum = " + sum);
    }

    public static boolean checkNumForSimple(int i){
        boolean flag = false;
        if(i == 2){
            flag = true;
        }
        int n = (int)Math.round(Math.pow(i, 0.5));
        for (int j = 2; j <= n; j++){
            if ( i % j != 0){
                flag = true;
            }
        }
        return flag;
    }
}
