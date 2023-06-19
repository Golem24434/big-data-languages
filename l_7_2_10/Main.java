import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "This is a test text 1234567890 !@#$%^&*()_+?><";
        Pattern pattern = Pattern.compile("[^a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        int maxLength = 0;
        String longestSubstring = "";
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if ((end - start) > maxLength) {
                maxLength = (end - start);
                longestSubstring = text.substring(start, end);
            }
        }
        System.out.println(longestSubstring);
    }

}

/*
Сначала мы определяем строку, в которой надо найти подстроку максимальной длины без букв. Затем мы создаем объект
`Pattern`, представляющий регулярное выражение, которое ищет все символы, отличные от букв. Это выражение `[a-zA-Z]`
со знаком каретки (^) в начале, что означает отрицание: оно найдет любой символ, отличный от букв латинского алфавита.
Мы создаем объект `Matcher`, который будет искать совпадения в тексте. Мы вызываем метод `find()`, чтобы найти первое
совпадение. Затем мы определяем начало и конец найденной подстроки с помощью методов `start()` и `end()` у объекта
`Matcher`. Если длина найденной подстроки больше предыдущей максимальной длины, мы обновляем значение
переменных `maxLength` и `longestSubstring`.
В конце код выводит найденную подстроку в консоль. В нашем примере это будет строка: `1234567890 !@#$%^&*()_+?><`
 */