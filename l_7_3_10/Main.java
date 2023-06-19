import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Рассортировать слова русского текста по возрастанию доли гласных букв";
        String[] words = text.split("\\s+");

        Map<String, Double> wordVowelRatios = new HashMap<>();

        for (String word : words) {
            int vowelCount = countVowels(word);
            int letterCount = word.length();
            double ratio = (double) vowelCount / letterCount;

            wordVowelRatios.put(word, ratio);
        }

        // Sort words by vowel ratio ascending
        List<Map.Entry<String, Double>> sortedWords = new LinkedList<>(wordVowelRatios.entrySet());
        Collections.sort(sortedWords, Comparator.comparing(Map.Entry::getValue));

        // Output sorted words
        for (Map.Entry<String, Double> entry : sortedWords) {
            System.out.println(entry.getKey());
        }
    }

    private static int countVowels(String word) {
        int count = 0;

        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'ю' || c == 'я') {
                count++;
            }
        }

        return count;
    }
}

/*
1. Получить текст на русском языке и разделить его на слова.
2. Для каждого слова подсчитать количество гласных букв и общее количество букв в слове.
3. Рассчитать отношение количества гласных к общему количеству букв в слове.
4. Отсортировать слова по возрастанию полученной доли гласных букв.
 */