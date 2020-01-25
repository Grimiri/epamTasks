package Algorithmization_2.decomposition;

/*
* 13. Два простых числа называются «близнецами»,
* если они отличаются друг от друга на 2 (например, 41 и 43).
* Найти и напечатать все пары «близнецов» из отрезка [n,2n],
* где n - заданное натуральное число больше 2.
* Для решения задачи использовать декомпозицию.
* */
public class Task_13 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("answer:");
        getFunc(n);

    }

    public static boolean isSimple(int num) {
        int n = (int) Math.pow(num, 0.5);
        for (int i = 2; i <= n; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void getFunc(int n){
        for (int i = n; i < 2*n; i++) {
            if(isSimple(i) && isSimple(i + 2) && i < ((2*n)-2)){
                System.out.print( i + " & " + (i+2) + " ");
            }
        }

    }
}
