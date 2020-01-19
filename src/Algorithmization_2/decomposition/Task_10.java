package Algorithmization_2.decomposition;
/*
* 10. Дано натуральное число N. Написать метод(методы) для формирования массива,
* элементами которого являются цифры числа N.
* */
public class Task_10 {
    public static void main(String[] args) {
        double d = -319.582476;
        System.out.println(d);
        transferToArray(d);
        int[] array = transferToArray(d);
        System.out.println("answer: ");
        for (int temp : array) {
            System.out.print(temp + " ");

        }
    }

    public static int[] transferToArray(double d){
        d = Math.abs(d);
        String string = String.valueOf(d).replace(".", "");
        char[] charArray = string.toCharArray();
        int[] array = new int[charArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return array;
    }
}
