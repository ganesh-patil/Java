class Display{

	public synchronized void wish(String name){

		for(int i =0; i<10;i++){
			System.out.print("Good Moring: ");
			try{
				Thread.sleep(2000);

			}
			catch(InterruptedException e){

			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	public Display d; 
	public String name; 

	public MyThread(Display obj, String name){
		d = obj;
		this.name = name;
	}

	public void run () {
		d.wish(name);
		
	}
}

class SynchronizedDemo {

	public static void main(String[] args){
		try{

			Display d = new Display();

		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Youvraj");

		t1.start();
		t2.start();
		
	}
		catch(Exception ie){

		}
	}
}