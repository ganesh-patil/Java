 class DeamonThreadTest extends Thread {
    public void run(){

    }
}

public class DeamonTest {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().isDaemon()); // false
    //    Thread.currentThread().setDaemon(true); //IllegalThreadStateException
        DeamonThreadTest dt = new DeamonThreadTest();
        System.out.println(dt.isDaemon()); // false
        dt.setDaemon(true);
        System.out.println(dt.isDaemon()); //true
    }
}
