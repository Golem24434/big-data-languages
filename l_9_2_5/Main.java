import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "baz", "qux");

        Map<Character, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(map);
    }
}