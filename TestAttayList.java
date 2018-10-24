import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAttayList {
    public static  void main(String[] args ){
        List<String> myList = new ArrayList<String>();
        myList.add("Ganesh");
        myList.add("Patil");
        myList.add("sdfsd");
        myList.add("sdf");

        /*for (String name: myList){
            System.out.println(name);
        }*/


       /* for(int i=0; i< myList.size(); i++){
            myList.remove(i);
            System.out.println(myList.get(i));
        }*/

       HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("ganesh","patil");
        myMap.put("Prakash","patil");
        myMap.put("Indu","patil");

        /*for( String val: myMap.keySet()){
            System.out.println(val);
        }*/

        for(Map.Entry<String, String> data : myMap.entrySet()){
            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }


    }

}
