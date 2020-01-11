package Algorithmization_2.matrix;

public class generationMatrixNxM {

    public int[][] generateIntMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        System.out.println("matrix: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for (int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random() * 10 );
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public int[][] generateIntPositiveMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        System.out.println("matrix: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for (int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random() * 15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public double[][] generateDoubleMatrix(int n, int m){
        double[][] matrix = new double[n][m];
        System.out.println("matrix: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for (int j = 0; j < m; j++){
                matrix[i][j] = Math.random() * 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public int[][] generateZeroMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        System.out.println("matrix: ");
        for (int i = 0; i < n; i++){
            System.out.print(i + ": ");
            for (int j = 0; j < m; j++){
                matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
