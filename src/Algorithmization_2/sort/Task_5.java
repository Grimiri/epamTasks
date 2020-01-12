package Algorithmization_2.sort;

import com.mysql.jdbc.EscapeTokenizer;

import java.util.Scanner;

/*
* 5. Сортировка вставками. Дана последовательность чисел a_1, a_2,...,a_n.
* Требуется переставить числа в порядке возрастания. Делается это следующим образом.
* Пусть a_1, a_2,...,a_n - упорядоченная последовательность,
* т. е. a_1 <= a_2 <=...=< a_n.
* Берется следующее число a_i+1 a и вставляется в последовательность так, чтобы новая
* последовательность была тоже возрастающей. Процесс производится до тех пор,
* пока все элементы от i+1 до n не будут перебраны.
* Примечание. Место помещения очередного элемента в отсортированную часть
* производить с помощью двоичного поиска.
* Двоичный поиск оформить в виде отдельной функции.
*
* [задание сформулировано не ясно, алгоритм сортировки вставками расписан не корректно - Vlad]
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n..");
        int n = scanner.nextInt();
        int[] array = new int[n];
        genSortArray(array);

        System.out.println("\nanswer array:");
        for (int val: array) {
            System.out.print(val + " ");
        }
    }

    public static int binarFind(int[] array , int val){
        int position = 0;

        return  position;
    }

    public static void genSortArray(int[] array) {
        //generate
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //sort
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
        }
        //output
        System.out.println("array:");
        for (int value : array) {
            System.out.print(value + " ");

        }
    }
}
