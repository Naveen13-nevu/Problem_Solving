public class ReverseString {
    
    public static void main(String[] args) {
        
        String str = "Naveen";
        int left = 0;
        int right = str.length()-1;
        char ch[] = str.toCharArray();

        while(left < right){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        for(char c: ch){
            System.out.print(c);
        }
    }
}
