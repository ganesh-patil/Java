package inheritance;

public class OverridingTest  extends  BaseClass{
   /* public int method2(){
        System.out.println("In Overriding class");
        return 0;
    }*/
    public int method1(){

        return 1;
    }

    public static void sm(){

        System.out.println("Sm child Called");

    }


    public static void main(String[] args){

        OverridingTest ort = new OverridingTest();
        ort.method1();
        ort.sm();
    }



}
