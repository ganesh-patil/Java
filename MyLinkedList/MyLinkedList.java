package MyLinkedList;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {
    Node start = null;
    Node end = null;
    public void addNode(int val){
        Node node = new Node();
        node.setData(val);
        node.setLink(null);
        if(start == null){
            start=  end = node;
        }
        else {
            end.setLink(node);
            end = node;
        }
    }
    public void displayList(){

        if(start == null) return;
        Node node = start;
        while (node != null) {
            System.out.println(node.getData()+"=>");
            node = node.getLink();
        }
    }
    public static void main(String[] args){
        MyLinkedList ml = new MyLinkedList();
        ml.addNode(1);
        ml.addNode(2);
        ml.addNode(3);
        ml.addNode(4);
        ml.displayList();
        List<Integer>  list  = new ArrayList();
//        list.add(5,"fg");



    }
}
