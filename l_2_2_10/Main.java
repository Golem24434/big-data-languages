import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Создаем матрицу и заполняем ее случайными значениями
        int[][] a = new int[n][n];
        int max_collumn = 0, max_string = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n + 1) - n;
                if (a[i][j] > a[max_collumn][max_string]) {
                    max_collumn = i;
                    max_string = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != max_collumn) {
                for (int j = 0; j < n; j++) {
                    if (j != max_string) {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.print(a[max_collumn][max_string]);
    }
}