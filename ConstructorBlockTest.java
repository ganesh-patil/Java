class A1{
    {
        System.out.println("in A1 block ");
    }
    public  A1(){
        System.out.println("In A1 constructoir");
    }
}
class B1 extends A1{
    {
        System.out.println("in B1 block ");
    }
    public  B1(){
        System.out.println("In B1 constructoir");
    }
}
class C1  extends  B1{
    {
        System.out.println("in C1 block ");
    }
    public  C1(){
        System.out.println("In C1 constructoir");
    }
}

public class ConstructorBlockTest {

    public static void main(String[] args){
        C1 c1 = new C1();
    }
}
