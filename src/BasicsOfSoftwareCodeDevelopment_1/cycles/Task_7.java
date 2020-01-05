package tasks.cycles;

import java.util.Scanner;
/*
* 7. Для каждого натурального числа в промежутке от m до n вывести все делители,
* кроме единицы и самого числа. m и n вводятся с клавиатуры
* */
public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter m..");
        int m = scanner.nextInt();
        System.out.println("enter n..");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++){
            System.out.print("num = " + i + ": ");
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.print(j + " | ");
                }
            }
            System.out.println();
        }
    }
}
