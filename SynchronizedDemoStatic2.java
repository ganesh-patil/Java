class Display4{

	public  static synchronized void wish(String name){

		for(int i =0; i<10;i++){
			System.out.print("Good Morning: ");
			try{
				Thread.sleep(2000);

			}
			catch(InterruptedException e){

			}
			System.out.println(name);
		}
	}
}

class MyThread6 extends Thread{
	public Display4 d; 
	public String name; 

	public MyThread6(Display4 obj, String name){
		d = obj;
		this.name = name;
	}

	public void run () {
//		d.wish(name);
		Display4.wish(name);
		
	}
}

class SynchronizedDemoStatic2 {

	public static void main(String[] args){
		try{

			Display4 d = new Display4();
			Display4 d2 = new Display4();

		MyThread6 t1 = new MyThread6(d, "Dhoni");
		MyThread6 t2 = new MyThread6(d2, "Youvraj");

		t1.start();
		t2.start();
		
	}
		catch(Exception ie){

		}
	}
}