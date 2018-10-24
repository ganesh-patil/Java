package TestHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] aregs){
        LinkedHashSet hs = new LinkedHashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add(1);
        hs.add(null);
        System.out.println(hs.add("A")); // false
        System.out.println(hs); //[A, B, C, 1, null]
    }
}
