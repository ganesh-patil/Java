
class MyThreadJoin extends Thread{
	public static Thread th;

	public void run () {

		try{
			th.join();
			
		}
		catch(InterruptedException ie){

		}

		for(int i= 0 ; i< 10; i++){
			System.out.println("Child Thred");
		   }
	}
}

class ThreadDemoJoin{

	public static void main(String[] args){
		try{

		MyThread t1 = new MyThread();
		MyThreadJoin.th = Thread.currentThread();
		t1.start();
		for(int i= 0 ; i< 10; i++){
			System.out.println("Main Thred");
		Thread.sleep(1);
		}
	}
		catch(InterruptedException ie){

		}
	}
}