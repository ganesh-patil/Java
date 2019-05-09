class Display2{

	public  void wish(String name){

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

class MyThread3 extends Thread{
	public Display2 d; 
	public String name; 

	public MyThread3(Display2 obj, String name){
		d = obj;
		this.name = name;
	}

	public void run () {
		d.wish(name);
		
	}
}

class SynchronizedDemo1 {

	public static void main(String[] args){
		try{

			Display2 d = new Display2();
			Display2 d2 = new Display2();

		MyThread3 t1 = new MyThread3(d, "Dhoni");
		MyThread3 t2 = new MyThread3(d2, "Youvraj");

		t1.start();
		t2.start();
		
	}
		catch(Exception ie){

		}
	}
}