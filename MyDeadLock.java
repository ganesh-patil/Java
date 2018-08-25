class A{
    public synchronized void d1(B b){
        System.out.println("Inside a.d1 method ");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Calling B last ");
        b.last();
    }
    public synchronized void last(){
        System.out.println("A last called ");
    }

}
class B{

    public synchronized  void d1(A a){
        System.out.println("Inside B.d1 method ");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Calling A last ");
        a.last();
    }
    public synchronized void last(){
        System.out.println("B last called ");
    }

}
public class MyDeadLock extends Thread{
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        a.d1(b);

    }
    public void run(){
        b.d1(a);
    }
    public static void main(String[] args ){

        MyDeadLock t1 = new MyDeadLock();
        t1.m1();
    }
}
