
class MyThread11 extends Thread{

	public void run () {

		try{
			for(int i= 0 ; i< 10; i++){
			System.out.println("Child Thred");
			Thread.sleep(2000);
		   }
		}
		catch(InterruptedException ie){

		}
	}
}

