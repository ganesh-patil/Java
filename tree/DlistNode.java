package tree;

public class DlistNode {
    int data;
    DlistNode prev;
    DlistNode next;

    public DlistNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DlistNode getPrev() {
        return prev;
    }

    public void setPrev(DlistNode prev) {
        this.prev = prev;
    }

    public DlistNode getNext() {
        return next;
    }

    public void setNext(DlistNode next) {
        this.next = next;
    }


}
