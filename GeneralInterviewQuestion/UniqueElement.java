import java.util.*;

public class UniqueElement {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,3,4,4,5};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key + " ");
            }
        }

    }
}
