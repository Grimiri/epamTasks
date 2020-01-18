package Algorithmization_2.sort.Task_8;

/*
 * Даны дроби [массив дробей вида - p/q], ( p , q - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 * */
public class Task_8 {
    public static void main(String[] args) {
        int n = 10;
        Fraction[] fractions = new Fraction[n];
        for (int i = 0; i < n; i++) {
            fractions[i] = new Fraction();
            fractions[i].setP((int) (Math.random() * 9 + 1));
            fractions[i].setQ((int) (Math.random() * 9 + 1));
        }
        System.out.println("array: ");
        for (Fraction f : fractions) {
            System.out.print(f);
        }
        System.out.println();

        int max = findMax(fractions);
        int noc = findNoc(max, fractions);

        System.out.println("noc = " + noc);

        castingF(fractions, noc);

        sortF(fractions);
        System.out.println("answer array:");
        for (Fraction f : fractions) {
            System.out.print(f);
        }
    }

    public static int findMax(Fraction[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i].getQ()) {
                max = array[i].getQ();
            }
        }
        return max;
    }

    public static int findNoc(int max, Fraction[] array) {
        int noc = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                boolean flag = false;
                while (!flag) {
                    flag = true;
                    if (max % array[i].getQ() != 0) {
                        flag = false;
                        max *= array[i].getQ();
                    }
                }
            }
            noc = max;
        }
        return noc;
    }

    public static void castingF(Fraction[] array, int noc) {
        for (int i = 0; i < array.length; i++) {
            array[i].setP(array[i].getP() * (noc / array[i].getQ()));
            array[i].setQ(noc);
        }
    }

    public static void sortF(Fraction[] array) {

        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].getP() > array[i + 1].getP()) {
                    Fraction temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = false;
                }
            }
        }
    }
}
