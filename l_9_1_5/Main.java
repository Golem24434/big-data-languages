import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listWithDuplicates = Arrays.asList("foo", "bar", "baz", "foo", "qux", "bar");

        List<String> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List with duplicates: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}