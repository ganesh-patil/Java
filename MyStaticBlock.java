
import java.util.ArrayList;
import java.util.List;
 
public class MyStaticBlock {
 
    private List<String> list;
    /* 
    static{
        //created required instances
        //create ur in-memory objects here
        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }

*/

 {
        //created required instances
        //create ur in-memory objects here
        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }

     
    public void testList(){
        System.out.println(list);
    }
     
    public static void main(String a[]){
        MyStaticBlock msb = new MyStaticBlock();
        msb.testList();
    }
}