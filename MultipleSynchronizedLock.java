class m1{

}
class m2{

}
class Display1{
    public void wish(String name){
//        synchronized (this){
            synchronized (this){

           m1 m1 = new m1();
           synchronized (m1){
               System.out.println("Got a lock on m1");
               m2 m2 = new m2();
               synchronized (m2){
                   System.out.println("Got a lock on m2");
               }

           }
        }

    }
}


class SynchronizedThread1 extends Thread{
    Display1 d;
    String name;
    public SynchronizedThread1(Display1 d, String name){
        this.d= d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

public class MultipleSynchronizedLock {

    public static void main(String[] args){
        Display1 d1 = new Display1();
        Display1 d2 = new Display1();

        SynchronizedThread1 t1 = new SynchronizedThread1(d1, "Pune");
        SynchronizedThread1 t2 = new SynchronizedThread1(d2, "Bengaluru");
        t1.start();
        t2.start();

    }
}
