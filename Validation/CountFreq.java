import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreq {
    public static void main(String[] args) {

        String str = "Naveen kumar";

        Map<String, Long> frequency = Arrays.stream(str.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(frequency);
    }
}