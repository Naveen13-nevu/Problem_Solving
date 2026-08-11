
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static int[] intersection (int nums1[], int nums2 []){

        Set<Integer> set1 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        Set<Integer> result = new HashSet<>();

        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        int []answer = new int[result.size()];

        int i=0;

        for(int num : result){
            answer[i++] = num;
        }
        return answer;


    }


    
    public static void main(String[] args) {
        
        int arr1[] = {1,2,2,3,4};
        int arr2[] = {2,2};

        int res[] = intersection(arr1, arr2);

        for(int num : res){
        
        System.out.println(num);

    }
}
}