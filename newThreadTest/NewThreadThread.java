package newThreadTest;

class ThreadTestThread extends Thread{
    @Override
    public void run() {
        System.out.println("In My run");
    }
}

public class NewThreadThread {
    public static void main(String[] srgs){
        Thread th = new Thread(new ThreadTestThread());
        th.start();
        ThreadTestThread hh = new ThreadTestThread(){
            @Override
            public void run() {
                System.out.println("In My run1");
            }
        };
        hh.start();
    }
}
