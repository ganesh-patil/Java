package src.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperations {

    public static void main(String[] args){

        String str = "Capitap";
        StringBuffer strbfr = new StringBuffer(str);
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        int tmp =0;
        for(int i= 0; i< strbfr.length(); i++){
            if(countMap.get(strbfr.charAt(i)) != null){
                tmp= countMap.get(strbfr.charAt(i));
                countMap.put(strbfr.charAt(i), ++tmp);
            }
            else {
                countMap.put(strbfr.charAt(i), 1);
            }
        }
        
        System.out.println(countMap);

        char[] inputChars = str.toCharArray();
        List<String> inpurStr = new ArrayList();
        for (char output : inputChars) {
			inpurStr.add(Character.toString(output));
		}
        System.out.println(inpurStr.stream().collect(Collectors.groupingBy(i -> i , Collectors.counting())));
      

        /*List strList =
        System.out.println(strList);*/

        List<Character> chars = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        System.out.println(chars);
//        Map<Character, Integer> countMap1 = chars.stream().collect(Collector.of())
    }
}
