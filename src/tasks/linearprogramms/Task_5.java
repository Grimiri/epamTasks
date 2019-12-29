package tasks.linearprogramms;

import java.util.Scanner;
/*
* 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
* данное значение длительности в часах, минутах и секундах в следующей форме:
* ННч ММмин SSc.
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter time value..");
        int time = scanner.nextInt();
        int hours = time / 60 / 60;
        int minuts = (time - hours * 60 * 60) / 60;
        int seconds = time % 60;

        System.out.println("Fiveth task answer = " + hours + "ч" + minuts + "мин" + seconds + "c");
    }
}
