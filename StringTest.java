

import java.util.*;

public class StringTest {

    public static void main(String[] args ){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abcs");

        System.out.println("s1 == s2"+ (s1==s2));
        System.out.println("s1 == s3"+ (s1==s3));
        System.out.println("s1 == s3"+ (s1.equals(s3)));
        System.out.println(s1 ==s2);
        int[] arr = {1, 3, 4, 5};
        int i =10;
        if(s1 instanceof Object){
            System.out.println("Yes this is an instance");
        }
//        if(i instanceof Object){
//            System.out.println("Yes this also is an instance");
//        }

        /*try{
            throw 1;
        }
        catch (int ex){

        }*/

     /*   String s1 = "Hello";
        String s2 = "World";
        s1 = s1+s2;
       *//* s2= s1.replace(s2,"");
        s1= s1.replace(s2,"");*//*
       s2 = s1.substring(0, s2.length());
       s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);*/

		/*
		 * Map hm = new HashMap(); hm.put("A", 2); hm.put("B",4); hm.put("C",5);
		 * hm.put(null, null); hm.put(null, null); // hm.remove(new String("A"));
		 * System.out.println(hm);
		 * 
		 * Hashtable ht = new Hashtable(); ht.put("A", 2); ht.put("B", 4);
		 * ht.remove("B"); // ht.put(null, null); System.out.println(ht);
		 * 
		 * PriorityQueue pq = new PriorityQueue(); pq.add(11); pq.add(12); pq.add(13);
		 * pq.add(2); pq.add(3); for (Object i: pq){ System.out.println(i.toString()); }
		 */
       /*Queue qq = new Quque();
        pq.add(11);
        pq.add(12);
        pq.add(13);
        pq.add(2);
        pq.add(3);
        for (Object i: pq){
            System.out.println(i.toString());
        }*/




    }
}
