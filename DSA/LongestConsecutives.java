
import java.util.HashSet;

public class LongestConsecutives {

    public static int longest(int [] arr){

        HashSet<Integer> set = new HashSet<>();
        int Maxlength =0;

        for(int num: arr){
            set.add(num);
        }

        for(int num : set){

            if(!set.contains(num - 1)){
                int current = num;
                int length = 1;
                while(set.contains(current +1)){
                    current++;
                    length++;
                }
                if(length > Maxlength){
                    Maxlength = length;
                }
            }
        }


        return Maxlength;
    }
    public static void main(String[] args) {
        
        int arr[] = {100,1,2,200,3,4};
        int result = longest(arr);
        System.out.println(result);


    }
}
