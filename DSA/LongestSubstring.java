public class LongestSubstring {
    
    public static void main(String[] args) {
        
        String str = "abccd";
        int Maxlength = 0;

        for(int i=0;i<str.length();i++){
            int currentLength = 0;
            boolean [] isVisited = new boolean[256];
            for(int j=i;j<str.length();j++){
                if(isVisited[str.charAt(j)]){
                    break;
                }
                isVisited[str.charAt(j)] = true;
                currentLength++;

            }
            if(currentLength > Maxlength){
                Maxlength = currentLength;
            }
        }
        System.out.println(Maxlength);
    }
}
