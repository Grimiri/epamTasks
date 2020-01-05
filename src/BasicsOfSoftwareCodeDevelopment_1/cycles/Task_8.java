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
        int firstNum = scanner.nextInt();
        System.out.println("enter second num..");
        int secondNum = scanner.nextInt();

        int[] numArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] firstNumArray = getIntArrayFormNum(firstNum);
        int[] secondNumArray = getIntArrayFormNum(secondNum);
        System.out.print("answer: ");
        for (int value : numArray) {
            if (haveNum(value, firstNumArray) && haveNum(value, secondNumArray)) {
                System.out.print(value + " ");
            }
        }
    }

    public static int[] getIntArrayFormNum(int num){
        if (num < 0) num = Math.abs(num);
        String sNum = String.valueOf(num);
        char[] charArray = sNum.toCharArray();
        int[] numArray = new int[sNum.length()];
        for (int i = 0; i < sNum.length(); i++){
            numArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return numArray;
    }

    public static boolean haveNum(int num, int[] array){
        boolean flag = false;
        for (int value : array) {
            if (value == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}


