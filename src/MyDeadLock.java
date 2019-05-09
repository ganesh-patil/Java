package src;

public class MyDeadLock {
	
	class A{
		void m1(B b ) {
			synchronized(this){
				System.out.print("A:: Synchronized block");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				b.m2();
			}
		}
		void m2() {
			synchronized(this) {
			System.out.print("A:: m2");
			}
		}
	}
	
	class B{
		void m1(A a) {
			synchronized(this){
				System.out.print("B:: Synchronized block");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a.m2();
			}
		}
		void m2() {
			synchronized(this) {
				System.out.print("B:: m2");
			}
			
		}
	}
	
	public static void main(String[] args ) {
		MyDeadLock md = new MyDeadLock();
		A a = md.new A();
		B b = md.new B();
		
		Thread t1 = new Thread( new Runnable() {
			@Override 
			public void run() {
				a.m1(b);
			}
		});
		t1.start();
		
		Thread t2 = new Thread( new Runnable() {
			@Override 
			public void run() {
				b.m1(a);
			}
		});
		t2.start();
		
	}
	

}
