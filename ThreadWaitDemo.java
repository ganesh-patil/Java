class ThreadB extends  Thread{
    int total= 0;
    public void run(){
        synchronized (this){
            System.out.println("Child thread starts calculation");
            for(int i=1; i<=100; i++){
                total = total+i;
            }
            System.out.println("Child thread calls notification");
            this.notify();
        }

    }
}

public class ThreadWaitDemo {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
//        b.join();
    //    Thread.sleep(1);
        synchronized (b){
            System.out.println("Main calls wait");
            b.wait();
            System.out.println("Main Thread got notification");
            System.out.println("Total="+ b.total);
        }

    }
}
