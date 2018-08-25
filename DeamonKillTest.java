 class DeamonThreadKillTest extends Thread {
    public void run(){
        for (int i=0; i< 10; i++){
            System.out.println("Child Thread ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

 public class DeamonKillTest {

     public static void main(String[] args){

         System.out.println("Main Thread ");
         DeamonThreadKillTest dt = new DeamonThreadKillTest();
         dt.setDaemon(true); // making thread as deamon
         // main thread is non deamon and child thread is deamon. hence whenever main thread terminates automatically child thread will be terminated.
         // In this case output is "Miain Thread "..
         dt.start();
     }
 }
