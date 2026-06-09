import java.util.*;
import java.util.stream.Collectors;
public class CountFrequecyOfElements {
    
public static void main(String []a){

    String[] words = {"Apple", "Banana","Mango","Apple","Apple","Tree"};

    Map<String,Long> frequency = Arrays.stream(words)
    .collect(Collectors.groupingBy(word -> word,Collectors.counting()));
    
    System.out.println(frequency);


}

}
