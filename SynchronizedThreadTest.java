class Display7{
    public void wish(String name){
//        synchronized (this){
            synchronized (Display7.class){

            for (int i=0; i< 10; i++){
                System.out.println("Good Morning :"+name);
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("Handled");
                }
            }
        }

    }
}


class SynchronizedThread extends Thread{
    Display7 d;
    String name;
    public SynchronizedThread(Display7 d, String name){
        this.d= d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedThreadTest {

    public static void main(String[] args){
        Display7 d1 = new Display7();
        Display7 d2 = new Display7();

        SynchronizedThread t1 = new SynchronizedThread(d1, "Pune");
        SynchronizedThread t2 = new SynchronizedThread(d2, "Bengaluru");
        t1.start();
        t2.start();

    }
}
