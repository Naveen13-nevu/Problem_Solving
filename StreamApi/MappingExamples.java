import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<Integer> nameLengths = names.stream()
                                           .map(String::length)
                                           .collect(Collectors.toList());

        System.out.println(nameLengths); 
    }
}