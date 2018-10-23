package Java8.ForEach.StramApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StramTest {

    public static void main(String[] args){
        List ids = new ArrayList();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);

        Map testData = new HashMap();
        ids.forEach(p -> testData.put("value"+p, p) );

        System.out.println(testData);

    }
}
