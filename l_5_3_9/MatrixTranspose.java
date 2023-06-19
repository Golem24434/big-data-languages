import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Чтение входного файла
        File inputFile = new File("input.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден!");
            return;
        }

        // Размерность матрицы
        int n = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            if (elements.length > n) {
                n = elements.length;
            }
        }
        scanner.close();

        // Создание двумерного массива матрицей
        double[][] matrix = new double[n][n];
        scanner = null;
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден!");
            return;
        }
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Double.parseDouble(elements[j]);
            }
            i++;
        }
        scanner.close();

        // Транспонирование матрицы
        double[][] transposedMatrix = new double[n][n];
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        // Запись результатов в выходной файл
        File outputFile = new File("output.txt");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден!");
            return;
        }

        // Вывод исходной матрицы
        printWriter.println("Исходная матрица:");
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.printf("%.2f ", matrix[i][j]);
            }
            printWriter.println();
        }
        printWriter.println();

        // Вывод транспонированной матрицы
        printWriter.println("Транспонированная матрица:");
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.printf("%.2f ", transposedMatrix[i][j]);
            }
            printWriter.println();
        }
        printWriter.close();

        System.out.println("Результаты работы программы записаны в файл output.txt");
    }
}