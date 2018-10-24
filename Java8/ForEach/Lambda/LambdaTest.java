package Java8.ForEach.Lambda;

public class LambdaTest {

    public static void main(String[] args){
        //int n = 10;
        MyFunctional fun = (n, m)->System.out.println(n);
        fun.myMethod(2, 3);
    }
}
