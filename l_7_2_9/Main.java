import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String text = "this test text";
        String[] words = text.split("\\s+");
        ArrayList<Character> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            boolean found = true;
            for (String word : words) {
                if (word.indexOf(c) == -1) {
                    found = false;
                    break;
                }
            }
            if (found) {
                result.add(c);
            }
        }
        System.out.println(result);
    }

}