package producerconsumer;

public class Monitor {
	
	private int[] nums = new int[3];
	private boolean ready = false;
	
	public synchronized void putNums(int[] nums){
		while (ready){
			try {
				wait();
			} catch(Exception e){
				System.out.println("Wait Interrupted in putNums");
			}
		}
		this.nums = nums;
		notifyAll();
		ready = true;
	}
	
	public synchronized int[] getNums(){
		while(!ready){
			try{
				wait();
			} catch (Exception e){
				System.out.println("Wait Interrupted in getNums");
			}
		}
		notifyAll();
		ready = false;
		return nums;
	}
}
