
public class kandanesAlgorithm {

    public static int kadane(int [] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=0;i<arr.length;i++){
            if(currentSum <0){
                currentSum = arr[i];
            }
            else{
                currentSum = currentSum+arr[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,-1,-2,3,4,-5};
        System.out.println(kadane(arr));
        
    }
}
