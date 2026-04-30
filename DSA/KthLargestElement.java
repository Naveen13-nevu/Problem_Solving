
import java.util.PriorityQueue;

public class KthLargestElement {
    
    public static int Largest(int arr[], int key){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : arr){
            pq.offer(n);
            if(pq.size()> key){
                pq.poll();
            }

        }
        return pq.peek();
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int k = 2;
        int result = Largest(arr,k);
        System.out.println(result);
        
    }
}
