import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Создаем матрицу и заполняем ее случайными значениями
        double[][] a = new double[n][n];
        double sum = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n + 1) - n;
                sum = sum + a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sum = sum / (n * n);
        System.out.print(sum + " ");
        System.out.println();
        // Выводим матрицу на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] - sum;
                System.out.print(a[i][j] - sum + " ");
            }
            System.out.println();
        }
    }
}