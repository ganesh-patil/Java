package TestCursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        for(int i=0; i< 10; i++){
            ll.add(i);
        }
        System.out.println(ll);
        ListIterator lt = ll.listIterator();
        while (lt.hasNext()){
            int elem = (Integer)lt.next();
            if(elem == 3){
                lt.add(33);
            }
            else if(elem == 5){
                lt.set(15);
            }
            else if(elem == 4){
                lt.remove();
            }
        }

        System.out.println(ll);

    }
}
