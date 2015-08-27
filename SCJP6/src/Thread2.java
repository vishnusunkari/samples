
public class Thread2 {

	public static void main(String[] args) {
		z:
		for(int i=0; i<5; i++){
			System.out.println("i: " + i);
			if(i==3) break z;
		}
		Runnable r = new Runnable(){
			public void run(){
				System.out.print("Cat");
			}
		};

		Thread t = new Thread(r){
			public void run(){
				System.out.print("Dog");
			}
		};
		t.start();
		
	}

}
