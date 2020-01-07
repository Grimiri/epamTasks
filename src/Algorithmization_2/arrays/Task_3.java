package Algorithmization_2.arrays;

import java.util.Scanner;

/*
* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
* положительных и нулевых элементов.
* */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        double[] array = new double[n];
        int plusElements = 0;
        int minusElements = 0;
        int zeroElements = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random() * 100 - 50;
//            для удобности проверки zero
//            array[i] = (int)(Math.random() * 10 - 5);
            System.out.print(array[i] + " | ");
            if (array[i] > 0){
                plusElements++;
            }
            else if (array[i] == 0){
                zeroElements++;
            }
            else {
                minusElements++;
            }
        }
        System.out.println("\nplus count = " + plusElements + "; minus count = " + minusElements + "; zero count = " + zeroElements + ".");
    }
}
