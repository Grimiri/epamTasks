package Algorithmization_2.matrix;

/*
* 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
* единиц равно номеру столбца.
*/
public class Task_14 {
    public static void main(String[] args) {
        int m = ((int)(Math.random() * 10) + 1);
        int n = ((int)(Math.random() * 10) + 1);
        System.out.println("m = " + m + "\nn = " + n);
        int[][] matrix = new int[m][n];
        System.out.println("answer: ");
        for (int i = 0; i < m; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
