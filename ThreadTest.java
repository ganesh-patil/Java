import java.util.HashMap;

class Count{
    public synchronized void m1() throws InterruptedException {
        wait();
        System.out.println("In m1");
      //  notify();
    }

    public synchronized  void m2() throws InterruptedException{
        //notify();
         Thread.sleep(5000);
        notify();
        System.out.println("In m2");
    }
}
class MyThread extends Thread {

    Count co;

    public MyThread(Count c){
        co =c;
    }

    public void run(){

        try {
            co.m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread started");

     }

}

class MyThread1 extends Thread {

    Count co;

    public MyThread1(Count c){
        co =c;
    }

    public void run(){

        try {
            co.m2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread started1");

    }

}
public class ThreadTest {

    public static void main(String[] args){
        Count c = new Count();
        MyThread mt = new MyThread(c);
        MyThread1 mt2 = new MyThread1(c);
        mt.start();
        mt2.start();
    }
}
