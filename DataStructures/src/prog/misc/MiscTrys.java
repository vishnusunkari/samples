package prog.misc;

public class MiscTrys {

	public int x;
	public MiscTrys(int x){
		this.x=x;
	}
	
	public MiscTrys(){
		this(25);
	}
	
	public static void main(String[] args) {
		long x = 124L;
		
		int a = 10;
		float b = 5.2f;
		//int rem = a%b;
		System.out.println(a%b);

		/*
		 * this returns false because 4.4f converts to double
		 * and since 4.4 cannot be exactly turned into binary form
		 * it loses certain bits and converts to double and is 
		 * compared to 4.4 double which is not equal 
		 */
		System.out.println(4.4f==4.4);
		System.out.println(4.5f==4.5);

	}

}
