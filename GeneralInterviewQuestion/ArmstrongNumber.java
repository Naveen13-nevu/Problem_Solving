

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int original = n;
        int numberOfDigits = String.valueOf(n).length();

        int sum = String.valueOf(n).chars()
                .map(c -> c - '0')
                .map(digit -> (int) Math.pow(digit, numberOfDigits))
                .sum();

        if(sum == original){
            System.out.println(original+" this is armstrong number");
        }
        else{
             System.out.println(original+" this is not a armstrong number");
        }
    }
}
