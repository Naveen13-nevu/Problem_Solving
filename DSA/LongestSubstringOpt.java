
import java.util.HashSet;

public class LongestSubstringOpt {

    public static int lengthOfSub(String s){

        HashSet<Character> set = new HashSet<>();

        int left =0;
        int maxLength = 0;

        for(int right =0; right <s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            int currentLength = right - left +1;
            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        
        String str = "abcdabab";

        int result = lengthOfSub(str);

        System.out.println(result);
    }
}
