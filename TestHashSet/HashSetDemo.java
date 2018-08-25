package TestHashSet;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] aregs){
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add(1);
        hs.add(null);
        System.out.println(hs.add("A")); // false
        System.out.println(hs); // [null, A, 1, B, C]
    }
}
