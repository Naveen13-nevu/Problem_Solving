
public class FirstOccurLastOccur {


    public static int firstOccur(int arr[] , int target){

        int low =0;
        int high = arr.length-1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    public static int lasttOccur(int arr[] , int target){

        int low =0;
        int high = arr.length-1;
        int result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                result = mid;
                low = mid+ 1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        int arr [] = { 1,2,3,3,3,3,4,5};
        int target = 3;
        System.out.println(" the first occurance of element is " + firstOccur(arr, target));
        System.out.println(" the last occurance of element is " + lasttOccur(arr, target));
    }
    
}
