class Display3{

	public  synchronized void Display3N(){

		for(int i =0; i<10;i++){
			System.out.print(i);
			try{
				Thread.sleep(2000);

			}
			catch(InterruptedException e){

			}
		}
	}

	public  synchronized void Display3C(){

		for(int i =65; i<75;i++){
			System.out.print((char)i);
			try{
				Thread.sleep(2000);

			}
			catch(InterruptedException e){

			}
		}
	}
}

class MyThread4 extends Thread{
	public Display3 d; 

	public MyThread4(Display3 obj, String name){
		d = obj;
	}

	public void run () {
		d.Display3N();
		
	}
}

class MyThread2 extends Thread{
	public Display3 d; 

	public MyThread2(Display3 obj, String name){
		d = obj;
	}

	public void run () {
		d.Display3C();
		
	}
}

class SynchronizedDemo3 {

	public static void main(String[] args){
		try{

			Display3 d = new Display3();
			// Display3 d2 = new Display3();

		MyThread4 t1 = new MyThread4(d, "Dhoni");
		MyThread4 t2 = new MyThread4(d, "Youvraj");

		t1.start();
		t2.start();
		
	}
		catch(Exception ie){

		}
	}
}