import java.util.*;
import java.util.stream.Collectors;

public class UpperCase {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("naveen","arun","gwen");

        List<String> result = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        result.forEach(e -> System.out.println(e));

    }
}
