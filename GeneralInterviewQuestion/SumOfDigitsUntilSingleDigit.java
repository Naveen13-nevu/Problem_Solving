public class SumOfDigitsUntilSingleDigit {

    public static int singleDigit(int n){

        while(n>=10){
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum = sum+d;
                n=n/10;
            }
            n = sum;

        }

        return n;
    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println(singleDigit(n));
    }
}
