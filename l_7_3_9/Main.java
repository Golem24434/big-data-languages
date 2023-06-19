import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String text = "в этом предложении мы должны отсортировать все слова по алфавиту начиная с первой буквы и дальше";

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Сортируем слова в алфавитном порядке по первой букве
        Arrays.sort(words, (a, b) -> a.charAt(0) - b.charAt(0));

        // Печатаем слова, начинающиеся с каждой буквы
        char currentLetter = ' ';
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (firstLetter != currentLetter) {
                currentLetter = firstLetter;
                System.out.println();
                System.out.print("   ");
            }
            System.out.print(word + " ");
        }
    }

}

/*
Сначала мы создаем строку `text`, которую хотим отсортировать. Затем мы используем метод `split()`
для разбиения строки на массив слов `words`.
Мы используем `Arrays.sort` для сортировки слов в
алфавитном порядке по первой букве. Для этого мы передаем вторым аргументом лямбда-выражение,
которое сравнивает два слова по их первой букве.
Затем мы проходимся по каждому слову в отсортированном массиве `words` и печатаем его на
экране. Если первая буква текущего слова отличается от предыдущей, мы переходим на новую строку,
чтобы создать красную строку.
 */