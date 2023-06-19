public class Main {
    public static void main(String[] args) {
        String text = "маркиза де помпадур любила говорить: после нас хоть потоп.";
        String[] words = text.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char firstChar = word.charAt(0);
            String modifiedWord = String.valueOf(firstChar);

            for (int i = 1; i < word.length(); i++) {
                char currentChar = word.charAt(i);

                if (currentChar != firstChar) {
                    modifiedWord += currentChar;
                }
            }

            result.append(modifiedWord).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}