package Algorithmization_2.decomposition;

/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 *
 * (когда все три числа простые и НОД == 1)
 * */
public class Task_6 {
    public static void main(String[] args) {
        System.out.println("answer: " + isMutuallySimple(5, 2, 13));
    }

    public static boolean isSimple(int num) {
        int n = (int) Math.pow(num, 0.5);
        for (int i = 2; i <= n; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isMutuallySimple(int a, int b, int c) {
        if (isSimple(a) && isSimple(b) && isSimple(c)) {
            int[] aArray = divisionForNod(a);
            int[] bArray = divisionForNod(b);
            int[] cArray = divisionForNod(c);
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < c; k++) {
                        if (aArray[i] == bArray[j] && aArray[i] == cArray[k]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int[] divisionForNod(int a) {
        int[] aDivisionArray = new int[a];
        for (int i = 1; i <= a; i++) {
            aDivisionArray[i - 1] = a / i;
        }
        return aDivisionArray;
    }
}
