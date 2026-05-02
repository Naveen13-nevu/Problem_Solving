public class MinNoOfPlatforms {

    public static void bubbleSort(int [] arr){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int minPlatform(int [] arr, int [] dep){

        int n = arr.length;
        bubbleSort(arr);
        bubbleSort(dep);

        int i=0, j=0, platform = 0,maxPlatform =0;

        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            if(platform>maxPlatform){
                maxPlatform = platform;

            }
        }
        return maxPlatform;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        int result = minPlatform(arr,dep);
        System.out.println(result);


    }
}
