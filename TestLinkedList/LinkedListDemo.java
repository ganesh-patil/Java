package TestLinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList l1= new LinkedList();
        l1.add("Ganesh");
        l1.add(30);
        l1.add(null);
        l1.add("Patil");
        l1.set(0, "Uma");
        l1.add(0, "Ganesh");
        l1.addFirst("Pune");

        System.out.println(l1); // [Pune, Ganesh, Uma, 30, null, Patil]
    }
}
