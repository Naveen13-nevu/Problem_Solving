public class StirngIntern {
    
    public static void main(String[] args) {
        
        String s1 = new String("Java");
        String s2 = s1.intern();
        System.out.println(s2 == "Java");
    }
}
