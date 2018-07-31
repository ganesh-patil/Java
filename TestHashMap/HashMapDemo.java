package TestHashMap;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args){
        HashMap h = new HashMap();
        h.put("abc","100");
        h.put("bca","200");
        h.put("cba","100");
        System.out.println(h); // {bca=200, abc=100, cba=100}

        System.out.println(h.put("bca","300"));  // 200
        Set s = h.keySet();
        System.out.println(s);  // [bca, abc, cba]
        Collection c = h.values();
        System.out.println(c); // [300, 100, 100]
        Set s1 = h.entrySet();
        System.out.println(s1);  // [bca=300, abc=100, cba=100]

        Iterator it = s1.iterator();
        while (it.hasNext()){
            Map.Entry k = (Map.Entry)it.next();
            System.out.println(k.getKey());
            System.out.println(k.getValue());

            if(k.getKey().equals("bca")){
                k.setValue("500");
            }
        }

        System.out.println(h); // {bca=500, abc=100, cba=100}


    }
}
