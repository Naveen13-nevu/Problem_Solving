public class SecondLargest {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};

        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else{
                if(arr[i] > secondLargest && arr[i] != firstLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println(secondLargest);

    }
}
