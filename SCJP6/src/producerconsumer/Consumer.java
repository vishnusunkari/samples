package producerconsumer;

public class Consumer extends Thread {

	private Monitor m;
	private int[] nums = new int[3];
	
	public Consumer(Monitor m){
		this.m = m;
	}
	
	public synchronized void run(){
		while(true){
			try{
				sleep(5000);
				nums = m.getNums();
				System.out.println("Consumed: " + nums[0] 
										  + " " + nums[1]
										  + " " + nums[2]);
			}catch(Exception e){
				System.out.println("Exception Consumer run while loop");
			}
		}
	} 
	                             
}
