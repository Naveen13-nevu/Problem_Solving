import java.util.HashSet;

public class RemoveDuplicates {
    
    public static void remove(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){

            set.add(num);
        }
        System.out.println(set);

    }


   public static void main(String[] args) {
       int arr[] = {1,2,3,3,3,4,4,5,5,6,6,8};
       remove(arr);
   } 
}
