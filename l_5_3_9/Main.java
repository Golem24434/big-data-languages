import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Если пути к файлам переданы в аргументах командной строки
        if (args.length == 2) {
            inputFilePath = args[0];
            outputFilePath = args[1];
        }

        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath);

        try {
            Scanner scanner = new Scanner(inputFile);
            int n = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split("\\s+");
                if (elements.length > n) {
                    n = elements.length;
                }
            }

            double[][] matrix = new double[n][n];
            scanner.close();

            scanner = new Scanner(inputFile);
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

            double[][] transposedMatrix = new double[n][n];

            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    transposedMatrix[i][j] = matrix[j][i];
                }
            }

            PrintWriter printWriter = new PrintWriter(outputFile);

            printWriter.println("Исходная матрица:");
            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.printf("%.2f ", matrix[i][j]);
                }
                printWriter.println();
            }

            printWriter.println();
            printWriter.println("Транспонированная матрица:");

            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.printf("%.2f ", transposedMatrix[i][j]);
                }
                printWriter.println();
            }

            printWriter.close();

            System.out.println("Результаты работы программы записаны в файл " + outputFilePath);

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден!");
            return;
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: неверный формат данных в файле!");
            return;
        }
    }
}