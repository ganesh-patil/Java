package inheritance;

class Parent{
    public Parent(){
        System.out.println("Parent Constructor called");
    }
    public Parent(int test){
        System.out.println("Parent Constructor called"+test);
    }
    public void method(){
        System.out.println("Parent Method called");
    }
}

public class SuperClass extends  Parent{
    public SuperClass(){
        super(10);
        System.out.println("SuperClass Constructor called");
    }
    public  static void main(String[] args){
        SuperClass sc = new SuperClass();
        sc.method();
    }
    public void method(){
        System.out.println("Method called");
        super.method();
    }
}
