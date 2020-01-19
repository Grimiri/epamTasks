package Algorithmization_2.decomposition;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * */
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(findNod(30, 15, 25, 5));
    }

    public static double findNod(int a, int b, int c, int e) {
        double nod = 1;
        double[] aArray = divisionForNod(a);
        double[] bArray = divisionForNod(b);
        double[] cArray = divisionForNod(c);
        double[] eArray = divisionForNod(e);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < e; l++) {
                        if (aArray[i] == bArray[j] && aArray[i] == cArray[k] && aArray[i] == eArray[l]) {
                            nod = aArray[i];
                            return nod;
                        }
                    }
                }
            }
        }
        return nod;
    }

    public static double[] divisionForNod(double a) {
        double[] aDivisionArray = new double[(int) a];
        for (int i = 1; i <= a; i++) {
            aDivisionArray[i - 1] = a / i;
        }
        return aDivisionArray;
    }
}
