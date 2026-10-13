

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int original = n;
        int sum = 0;
       
        while(n>0){
            int d = n%10;
            sum = sum + d*d*d;
            n = n/10;
        }

        if(sum == original){
            System.out.println(original+" this is armstrong number");
        }
        else{
             System.out.println(original+" this is not a armstrong number");
        }
    }
}
