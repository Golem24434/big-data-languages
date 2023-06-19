import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int m = 2; // количество последних слов
        int n = 3; // количество последних строк

        File inputFile = new File("input.txt"); // имя входного файла
        File outputFile = new File("output.txt"); // имя выходного файла

        // Создаем объект Scanner для чтения данных из файла
        Scanner scanner = new Scanner(inputFile);

        Deque<String> lastNLines = new ArrayDeque<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lastNLines.offer(line);
            if (lastNLines.size() > n) {
                lastNLines.poll();
            }
        }

        PrintWriter writer = new PrintWriter(outputFile);
        for (String line : lastNLines) {
            String[] words = line.split("\\s+");
            if (words.length >= m) {
                for (int i = words.length - m; i < words.length; i++) {
                    writer.print(words[i] + " ");
                }
                writer.println();
            }
        }

        // Закрываем объекты Scanner и PrintWriter
        scanner.close();
        writer.close();
    }
}