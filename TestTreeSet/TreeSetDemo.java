package TestTreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet t =  new TreeSet();
        t.add("M");
        t.add("A");
        t.add("a");
        t.add("B");
       // t.add(new Integer(10)); // not allowed ClassCastException
       //  t.add(null); // NullPointerException
        System.out.println(t); //[A, B, M, a]

    }
}
