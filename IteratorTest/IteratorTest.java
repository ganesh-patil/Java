package IteratorTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

    public static void main(String[] args){
        List test = new ArrayList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        Iterator e = test.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
       //     test.add(0); // java.util.ConcurrentModificationException
   
        }

        ListIterator e1 = test.listIterator();
        while (e1.hasNext()){
            System.out.println(e1.next()); 
            e1.add(6);
            // test.add(0); //java.util.ConcurrentModificationException
        }
        System.out.println(test);
    }
}
