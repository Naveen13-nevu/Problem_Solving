
import java.util.HashSet;




public class FindDuplicates {
    
    public static void dup(int [] arr){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int n: arr){

            if(set.contains(n)){
                duplicates.add(n);
            }
            else{
                set.add(n);
            }

        }
        System.out.println(duplicates);

        
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,3,4,4,5,5,5,6};

        dup(arr);
    }
}
