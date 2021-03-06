/**
 * Created by COOLib on 03.01.2016.
 */
public class Test {
    public static void main(String[] args) {


        // Здесь можно создать методы лили вообще классы для создания матриц вместо создания их в мейне

        int[][] a = new int[4][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }

        // Аналогично, можно создать метод вывода на экран в другом классе

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("% 4d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] b = new int[5][2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.format("% 4d", b[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] k = MatrixCalculation.matrixMultiply(a, b);

       for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                System.out.format("% 4d", k[i][j]);
            }
            System.out.println();
        }

    }
}
