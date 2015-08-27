package producerconsumer;

public class Producer extends Thread {
	
	private Monitor m;
	private int[] nums = new int[3];
	
	public Producer(Monitor m){
		this.m = m;
	}
	
	public synchronized void run(){
		while(true){
			try{
				sleep(3000);
				for(int i=0; i<nums.length; i++){
					nums[i] = (int)(Math.random()*10);
				}
				System.out.println("Produced " + nums[0] 
				                         + " " + nums[1]
										 + " " + nums[2]);
				m.putNums(nums);
			} catch(Exception e){
				System.out.println("Exception in producer run while true");
			}
		}
	}
	
}
