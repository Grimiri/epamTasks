package tasks.linearprogramms;

import java.util.Scanner;
/*
* 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
* дробную и целую части числа и вывести полученное значение числа.
* */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter r.. ");
        float r = scanner.nextFloat();
        float ddd = Math.round(r % 1 * 1000);
        float nnn = (r - ddd / 1000) / 1000;

        r = ddd + nnn;

        System.out.println("Fourth task answer = " + r);
    }
}
