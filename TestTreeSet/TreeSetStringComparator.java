package TestTreeSet;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator1 implements Comparator {
    public int compare(Object obj1, Object obj2){
        String i1= (String) obj1;
        String i2= obj2.toString();
        return i1.compareTo(i2);

    }
}

public class TreeSetStringComparator {

    public static void main(String[] args){
        TreeSet t = new TreeSet(new MyComparator1()); // custom comparator
        t.add("abc");
        t.add("cba");
        t.add("cab");
        System.out.println(t);

    }
}
