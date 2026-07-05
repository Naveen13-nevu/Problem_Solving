public class Except {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[7]);
            System.out.println(10/0);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(ArithmeticException a)
        {
        a.printStackTrace();
        }
        
        
        }
    }