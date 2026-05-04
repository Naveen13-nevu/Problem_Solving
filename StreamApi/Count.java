import java.util.*;

public class Count {
    
    public static void main(String[] args) {
        
    List<Integer> list = Arrays.asList(8,9,10,20,30,40,50);

        long count = list.stream()
    .filter(n -> n > 10)
    .count();

    System.out.println(count);
        
    }
}
