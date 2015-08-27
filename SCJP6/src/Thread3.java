
public class Thread3 extends Thread {
	private int num = 0;
	
	public Thread3(){
		this(0);
	}
	
	public Thread3(int num){
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep((long) 5000L);
			} catch (Exception e){
				
			}
			System.out.println("Message - " + i + " from Thread - " + num);
		}
		System.out.println("Thread - " + num + " is done.");
	}

}
