package TestCursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args){
        Vector v = new Vector();
        for(int i= 1; i<= 10; i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        for(;e.hasMoreElements();){
            System.out.println(e.nextElement());
        }

        System.out.println(v);
    }
}
