
class MyThreadIntrr2 extends Thread{
//	public static Thread th;

	public void run () {

		try{
			for(int i= 0 ; i< 1000; i++){
			System.out.println("Child Thred");
		   }
			
			System.out.println("out of loop");
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){

           System.out.println("Child Thread interrupted ");
		}

		
	}
}

class ThreadDemoInterrrupted1{

	public static void main(String[] args){
		try{

		MyThreadIntrr2 t1 = new MyThreadIntrr2();
		//MyThreadIntrr2.th = Thread.currentThread();

		t1.start();
		//t1.join();
		t1.interrupt();
		for(int i= 0 ; i< 10; i++){
			System.out.println("Main Thred");
		//Thread.sleep(1);
		}
	}
		catch(Exception ie){

		}
	}
}