package InterfaceTest;

public class MyClass extends MyAbstract{

    public void m1(){
        System.out.println("My");
    }

    public static void main(String[] args){

        MyAbstract m  = new MyClass();
        m.m1();
    }
}
