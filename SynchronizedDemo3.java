class Display{

	public  synchronized void displayN(){

		for(int i =0; i<10;i++){
			System.out.print(i);
			try{
				Thread.sleep(2000);

			}
			catch(InterruptedException e){

			}
		}
	}

	public  synchronized void displayC(){

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

class MyThread1 extends Thread{
	public Display d; 

	public MyThread1(Display obj, String name){
		d = obj;
	}

	public void run () {
		d.displayN();
		
	}
}

class MyThread2 extends Thread{
	public Display d; 

	public MyThread2(Display obj, String name){
		d = obj;
	}

	public void run () {
		d.displayC();
		
	}
}

class SynchronizedDemo3 {

	public static void main(String[] args){
		try{

			Display d = new Display();
			// Display d2 = new Display();

		MyThread1 t1 = new MyThread1(d, "Dhoni");
		MyThread2 t2 = new MyThread2(d, "Youvraj");

		t1.start();
		t2.start();
		
	}
		catch(Exception ie){

		}
	}
}