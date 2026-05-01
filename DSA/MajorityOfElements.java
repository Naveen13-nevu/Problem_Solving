
import java.util.HashMap;

public class MajorityOfElements {

    public static int major(int [] num){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int nums : num){

           int count = map.getOrDefault(nums, 0) + 1;
            map.put(nums, count);

         if(count > num.length / 2){

            return nums;
        }

        }

        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,5,5,5};
        int result = major(arr);
        System.out.println(result);


    }
}
