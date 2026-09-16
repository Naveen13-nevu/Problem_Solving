import java.util.*;

public class UpperCase {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("naveen","arun","gwen");

        names.stream()
        .map(String::toUpperCase)
        .forEach(e-> System.out.println(e));

        // List<String> result = names.stream()
        // .map(String::toUpperCase)
        // .collect(Collectors.toList());

        // result.forEach(e -> System.out.println(e));

    }
}
