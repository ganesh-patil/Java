
class MyThread extends Thread{
	public static Thread th;

	public void run () {

		try{
			for(int i= 0 ; i< 10; i++){
			System.out.println("Child Thred");
			Thread.sleep(4000);
		   }
			
		}
		catch(InterruptedException ie){

           System.out.println("Child Thread interrupted ");
		}

		
	}
}

class ThreadDemoInterrrupted{

	public static void main(String[] args){
		try{

		MyThread t1 = new MyThread();
		//MyThread.th = Thread.currentThread();

		t1.start();
		//t1.join();
		t1.interrupt();
		for(int i= 0 ; i< 10; i++){
			System.out.println("Main Thred");
		Thread.sleep(1);
		}
	}
		catch(InterruptedException ie){

		}
	}
}