package TestTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

 class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
       Integer i1= (Integer) obj1;
       Integer i2= (Integer) obj2;
//       return i2-i1;
        return -i1.compareTo(i2);

    }
}

public class TreeSetComparator {

    public static void main(String[] args){
        TreeSet t = new TreeSet(new MyComparator()); // custom comparator
        t.add(20);
        t.add(2);
        t.add(21);
        System.out.println(t);

    }
}
