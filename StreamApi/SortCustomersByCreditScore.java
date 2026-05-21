import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Customer {
    String name;
    int creditScore;

    Customer(String name, int creditScore) {
        this.name = name;
        this.creditScore = creditScore;
    }
}

public class SortCustomersByCreditScore {
    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer("Naveen", 700),
                new Customer("Arun", 820),
                new Customer("Rocky", 650)
        );

        customers.stream()
                .sorted(Comparator.comparingInt(c -> c.creditScore))
                .forEach(c -> System.out.println(
                        c.name + " : " + c.creditScore
                ));
    }
}