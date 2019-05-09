package tree;

public class Btree {
    public Node node;
    public DlistNode start ;
    public DlistNode end ;

    public static void main(String[] args){
        Btree btree = new Btree();
        Node n1 = new Node(5);
        n1.left = new Node(4);
        n1.right = new Node(3);
        n1.left.left = new Node(1);
        n1.left.right = new Node(2);
        btree.node = n1;
        btree.displayNode(btree.node);


    }

    public void displayNode(Node n){
        System.out.println(n.getData());
        if(n.getLeft() != null){
            displayNode(n.getLeft());
        }
        if(n.getRight() != null){
            displayNode(n.getRight());
        }
     //   n.notify(); //  java.lang.IllegalMonitorStateException
    }

    public void bTreeToDList(Node node, Node parent) {
        if(node.getLeft() == null);
    }

}
