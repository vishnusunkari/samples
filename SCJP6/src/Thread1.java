
public class Thread1 extends Thread {	
	
	public void run(){
		System.out.println("Thread execution ");
	}
	public static void main(String[] args) {
		new Thread1().go();
	}
	public void go(){
		Runnable r = new Runnable() {
			public void run(){
				System.out.println("foo");
			}
		};
		Thread t = new Thread(r);
		Thread1 th = new Thread1();
		
		th.start();
		th.start();
	}
}
