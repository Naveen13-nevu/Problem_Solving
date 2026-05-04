import java.util.*;

public class FirstElementGreaterThanFive {

    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7);

        Optional<Integer> result = num.stream()
        .filter(n-> n>5)
        .findFirst();

        result.ifPresent(System.out::println);


    }

}
