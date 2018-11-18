package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

    public static void main(String[] args){

        String[] testArr = {"Kabaa", "mSSS", "ksdsfsd", "ghfgdfg", "Ksdfds"};

        Stream<String> t= Stream.of(testArr);
        Predicate<String>  isStartsWithK = i->i.startsWith("K");
        List<String> result = t.filter(i -> isStartsWithK.test(i)).collect(Collectors.toList());
        System.out.println(result);
    }
}
