public class ReplaceString {
    
    public static void main(String[] args) {
        
        String str = "banana";
        char ch[] = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(ch[i] == 'a'){
                ch[i] ='o';
            }
        }
        for(char c: ch){
            System.out.print(c+ " ");
        }

    }
}
