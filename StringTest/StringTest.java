package StringTest;

public class StringTest {
    public static void main(String[] args){
        String s1 = "ganesh";
        String s2 = "GANESH";
        String s3 = new String("GANESH");
        String s4 = "GANESH";
        System.out.println(s2.equals(s3));  // true
        System.out.println(s2 == s3);  // false
        System.out.println(s2 == s4);   // true
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
