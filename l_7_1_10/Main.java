public class Main {
    public static void main(String[] args) {
        String text = "Это (текст), который нужно 'редактировать'.";
        String editedText = removeBetween(text, args[0].charAt(0), args[1].charAt(0));
        System.out.println(editedText); // Output: "Это , который нужно *редактировать*."
    }

    public static String removeBetween(String text, char start, char end) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) == start) {
                i++;
                while (i < text.length() && text.charAt(i) != end) {
                    i++;
                }
                i++;
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}