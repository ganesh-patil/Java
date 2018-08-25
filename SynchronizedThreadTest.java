class Display{
    public void wish(String name){
//        synchronized (this){
            synchronized (Display.class){

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
    Display d;
    String name;
    public SynchronizedThread(Display d, String name){
        this.d= d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedThreadTest {

    public static void main(String[] args){
        Display d1 = new Display();
        Display d2 = new Display();

        SynchronizedThread t1 = new SynchronizedThread(d1, "Pune");
        SynchronizedThread t2 = new SynchronizedThread(d2, "Bengaluru");
        t1.start();
        t2.start();

    }
}
