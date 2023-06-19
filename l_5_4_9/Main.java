import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создаем объект File для файла, который хотим прочитать
        File inputFile = new File("input.txt");

        // Создаем объект Scanner для чтения данных из файла
        Scanner scanner = new Scanner(inputFile);

        // Создаем объект File для создания нового файла
        File outputFile = new File("out/output.txt");

        // Создаем директорию out, если ее нет
        File outDir = new File("out");
        outDir.mkdir();

        // Создаем объект PrintWriter для записи данных в новый файл
        PrintWriter writer = new PrintWriter(outputFile);

        // Читаем строки из файла и меняем местами первое и последнее слова
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            if (words.length > 1) {
                String firstWord = words[0];
                String lastWord = words[words.length - 1];
                words[0] = lastWord;
                words[words.length - 1] = firstWord;
            }
            String newLine = String.join(" ", words);
            writer.println(newLine);
        }

        // Закрываем объекты Scanner и PrintWriter
        scanner.close();
        writer.close();
    }
}