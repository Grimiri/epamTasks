package tasks.cycles;

import java.awt.event.MouseAdapter;
import java.util.Scanner;
/*
* 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
* заданному е. Общий член ряда имеет вид: a_n = 1 / 2^n + 1 / 3^n
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sequence length.. ");
        int l = scanner.nextInt();
        System.out.println("enter e (less then 0,001)..");
        double e = scanner.nextDouble();
        int flag = 0;
        double sum = 0;
        for (int i = 1; i <= l; i++){
            double num = 1 / Math.pow(2,i) + 1 / Math.pow(3,i);
            System.out.println(i + " = " + num);
            if (Math.abs(num) >= e && flag < 3){
                sum += num;
                flag++;
                System.out.println("sum = " + sum);
            }
        }
        System.out.println("answer: sum = " + sum);

    }
}
