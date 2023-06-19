import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String text = "Исключить из текста подстроку максимальной длины, начинающуюся и заканчивающуюся одним и тем же символом";

        // Find all substrings that start and end with the same character
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    substrings.add(text.substring(i, j + 1));
                }
            }
        }

        // Find the longest substring
        String longestSubstring = "";

        for (String substring : substrings) {
            if (substring.length() > longestSubstring.length()) {
                longestSubstring = substring;
            }
        }

        // Remove the longest substring from the original text
        String result = text.replace(longestSubstring, "");

        System.out.println(result);
    }
}