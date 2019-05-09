package src.Exceptions;

public class ClassCasteExample {

    public static void main(String[] args){
        String s  = new String("Ganesh");
        Object obj = (Object) s; // this is valid

        Object obj1 = new Object();
        String s1 = (String)  obj1;  // Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String

    }
}
