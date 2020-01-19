package Algorithmization_2.decomposition;

/*
 * 12. Даны натуральные числа К и N.
 * Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр
 * которых равна К и которые не большее N.
 * */
public class Task_12 {
    public static void main(String[] args) {
        int k = 15, n = 5;
        int[] array = idea(k, n);
        System.out.println("k = " + k + " and n = " + n + " answer:");
        for (int temp :
                array) {
            System.out.print(temp + " ");

        }
    }


    public static int generateNeedNum(int notMoreThis) {
        //  +1 т.к. нам не нужен 0, а -1 что бы после добавления 1 число небыло больше N
        return (int) (Math.random() * (notMoreThis - 1)) + 1;
    }

    public static boolean isSumOfNumsLikeInNum(int num, int k) {
        char[] charArray = String.valueOf(num).toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += Integer.parseInt(String.valueOf(charArray[i]));
        }
        return sum == k;
    }
    public static int getSumOfNums(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += Integer.parseInt(String.valueOf(charArray[i]));
        }
        return sum;
    }
//     TODO: 20.01.2020 переполнение int в concateAndGetInt - при большом K и маленьком значении N
    public static int concateAndGetInt(int sum, int num) {
        sum = Integer.parseInt("" + sum + num);
        return sum;
    }

    public static int setLastEl(int sum, int temp, int k){
        while (!isSumOfNumsLikeInNum(sum, k)){
            sum = sum / 10;
            temp--;
            sum = concateAndGetInt(sum, temp);
        }
        return sum;
    }

    public static int[] transferToArray(int d){
        d = Math.abs(d);
        String string = String.valueOf(d);
        char[] charArray = string.toCharArray();
        int[] array = new int[charArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return array;
    }

    public static int[] idea(int k, int n) {
        int num = 0;
        for (int i = 1; ; i++) {
            if (i == n) {
                i = 1;
            }
            int temp = i;
            num = concateAndGetInt(num, temp);
            if (getSumOfNums(num) > k) {
                num = setLastEl(num, temp, k);
            }
            if (isSumOfNumsLikeInNum(num, k)) {
                break;
            }
        }
        return transferToArray(num);
    }
}

