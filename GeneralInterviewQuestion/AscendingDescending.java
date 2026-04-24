
import java.util.Scanner;

public class AscendingDescending {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int count =0;

        System.out.println("Enter ten unique element: ");
        while(count<10){
            int num = sc.nextInt();

            boolean isDuplicate = false;
            for(int i=0;i<count;i++){
                if(arr[i] == num){
                    isDuplicate = true;
                
                }
            }
                
                if(isDuplicate){
                    System.out.println("Enter 10 unique elements: ");
                }
                else{
                    arr[count++] = num;
                }
        }

        for(int i=0;i<5-1;i++){
            for(int j=0;j<5-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=5;i<10-1;i++){
            for(int j=5;j<10-(i-5)-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }

    }
}
