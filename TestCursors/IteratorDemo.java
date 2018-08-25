package TestCursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args){
        ArrayList al = new ArrayList();
        for (int i=0; i< 10; i ++){
            al.add(i);
        }
        System.out.println(al);
        Iterator it = al.iterator();
        while (it.hasNext()){
            int a = (Integer)it.next();
            if(a%2 ==0){
                System.out.println(a);
            }
            else{
                it.remove();
            }

        }
        System.out.println(al);
    }
}
