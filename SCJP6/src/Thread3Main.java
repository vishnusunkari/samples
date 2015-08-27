
public class Thread3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main thread");
		Thread3 t1 = new Thread3(1);
		Thread3 t2 = new Thread3(2);
		Thread3 t3 = new Thread3(3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
