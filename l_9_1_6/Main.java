import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "baz", "qux");

        String joined = list.stream()
                .collect(Collectors.joining(":"));

        System.out.println(joined);
    }
}