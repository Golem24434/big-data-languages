public class Main {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy and cool dog";
        int n = 4;
        String result = removeWords(text, n);
        System.out.println(result);
    }

    public static String removeWords(String text, int n) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() != n || isVowel(word.charAt(0))) {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
