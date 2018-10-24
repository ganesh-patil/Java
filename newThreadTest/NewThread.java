package newThreadTest;

public class NewThread implements Runnable {
    @Override
    public  void run() {

        for(int i = 0; i< 10; i++){
            System.out.println(i);
        }

    }

}

class ThreadTest{
    public static void main(String[] args){
        NewThread nt = new NewThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is new threds method");
            }
        });

        t1.start();
        Thread t2 = new Thread(nt);
        t2.start();
    }
}
