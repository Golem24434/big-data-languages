import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        int sumOfEvens = list.stream()
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println("Sum of evens: " + sumOfEvens);
    }
}