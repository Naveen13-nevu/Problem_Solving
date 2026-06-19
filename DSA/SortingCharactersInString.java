public class SortingCharactersInString {
  
    public static void main(String []args){

        String str = "naveen";

        char ch [] = str.toCharArray();
        int n = ch.length;
        for(int i=0;i<n-i;i++){
            for(int j=0;j<n-i-1;j++){
                if(ch[j] > ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        System.out.println(new String(ch));

    }
}
