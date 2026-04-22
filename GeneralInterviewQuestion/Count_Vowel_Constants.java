
public class Count_Vowel_Constants {

    public static void main(String[] args) {
        String str = "Naveen";
        int vowel =0;
        int constants = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch =='u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowel++;
            }
            else{
                constants++;
            }
        }
        System.out.println("vowel counts: "+ vowel);
        System.out.println("constants: "+ constants);
    }
}
