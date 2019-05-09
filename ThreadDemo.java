class ThreadDemo{

	public static void main(String[] args){
		try{

		MyThread11 t1 = new MyThread11();
		t1.start();
		t1.join();
		for(int i= 0 ; i< 10; i++){
			System.out.println("Main Thred");
			Thread.sleep(1);
		}
	}
		catch(InterruptedException ie){

		}
		
		
	}
}