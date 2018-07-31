package TestTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class myComparable implements Comparator {

    public int compare(Object b, Object c){
        String s1 = b.toString();
        String s2= c.toString();
        return -s1.compareTo(s2);
    }

}

public class TreeSetDemoStringBuffer {
    public static void main(String[] args){
        Comparator mc = new myComparable();
        TreeSet t =  new TreeSet(mc);
        t.add(new StringBuffer("M"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("K"));

       // t.add(new Integer(10)); // not allowed ClassCastException
       //  t.add(null); // NullPointerException
        System.out.println(t); //[A, B, M, a]

    }
}
