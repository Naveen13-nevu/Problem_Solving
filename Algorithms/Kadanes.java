
// “Find the maximum sum of a contiguous subarray.”

public class Kadanes {
    public static void main(String[] args) {
        
        int arr[] = {1,2,-5,3,4,-10,5};
        int sum =arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum = arr[i];
            }
            else{
                sum = sum+arr[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);

    }
}
