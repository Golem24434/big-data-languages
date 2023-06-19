import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set {
    private List<Integer> elements;

    public Set(Integer... elements) {
        this(Arrays.asList(elements));
    }

    private Set(List<Integer> elements) {
        this.elements = elements;
    }

    public Set intersect(Set other) {
        return new Set(elements.stream()
                .filter(other.elements::contains)
                .collect(Collectors.toList()));
    }

    public Set unify(Set other) {
        return new Set(Stream.concat(this.elements.stream(), other.elements.stream())
                .distinct()
                .collect(Collectors.toList()));
    }
    
    public String toString() {
        return "Elements=" + elements;
    }
}