package producerconsumer;

public class ProducerConsumerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Producer p1 = new Producer(m1);
		Consumer c1 = new Consumer(m1);
		p1.start();
		c1.start();
	}

}
