package tasks.cycles;

import java.util.Scanner;
/*
* 8. Даны два числа. Определить цифры,
* входящие в запись как первого так и второго числа.
* */
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first num..");
        String firstNum = scanner.next();
        System.out.println("enter second num..");
        double secondNum = scanner.nextDouble();

        String finalNum = firstNum;// + secondNum;
        char[] charArray = finalNum.toCharArray();
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++){
            if(!String.valueOf(charArray[i]).equals(",") && !String.valueOf(charArray[i]).equals("-")) {
                intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));

            }
            System.out.print(intArray[i] + "_");
        }
        System.out.println("\n" + intArray.length + " " + charArray.length);
    }
}
