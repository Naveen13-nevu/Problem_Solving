import java.util.Arrays;
import java.util.List;

public class CountStringStartWithA {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ajay", "Arun", "Naveen", "Anu");

        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println(count);
    }
}