package Algorithmization_2.decomposition;
/*
* Написать метод(методы) для нахождения наибольшего общего делителя
* и наименьшего общего кратного двух натуральных чисел
* */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("NOD = " + findNod(10,4));
        System.out.println("NOC = " + findNoc(21, 7));

    }

    public static int findNod(int a, int b){
        int nod = 0;
        int[] aArray = divisionForNod(a);
        int[] bArray = divisionForNod(b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(aArray[i] == bArray[j]){
                    nod = aArray[i];
                    return nod;
                }
            }
        }
        return nod;
    }

    public static int[] divisionForNod(int a){
        int[] aDivisionArray = new int[a];
        for (int i = 1; i <= a; i++) {
            aDivisionArray[i - 1] = a / i;
        }
        return aDivisionArray;
    }

    public static int findNoc(int a, int b){
        return Math.abs(a * b)/findNod(a,b);
    }
}
