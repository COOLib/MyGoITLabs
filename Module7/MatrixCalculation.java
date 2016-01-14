/**
 * Created by COOLib on 05.01.2016.
 */
public class MatrixCalculation {

    public static int[][] numberMultiply(int[][] a, int x) {

        if (a == null) {
            return null;
        }
        if (a.length == 0 || a[0].length == 0) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] * x;
            }
        }
        return a;
    }

    public static int[][] plus(int[][] a, int[][] b) {

        if (a == null || b == null) {
            return null;
        }
        if (a.length != b.length || a[0].length != b[0].length) {
            return null;
        }
        if (a.length == 0 || a[0].length == 0) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] += b[i][j];
            }
        }

        return a;
    }

    public static int[][] minus(int[][] a, int[][] b) {

        if (a == null || b == null) {
            return null;
        }
        if (a.length != b.length || a[0].length != b[0].length) {
            return null;
        }
        if (a.length == 0 || a[0].length == 0) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] -= b[i][j];
            }
        }

        return a;
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {

        if (a == null || b == null) {
            return null;
        }
        if (a[0].length != b.length) {
            return null;
        } else {

            int k = a.length;
            int l = b.length;
            int m = b[0].length;

            int[][] multiply = new int[k][m];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < m; j++) {
                    for (int h = 0; h < l; h++) {
                        multiply[i][j] += a[i][h] * b[h][j];
                    }
                }
            }

            return multiply;
        }
    }
}
