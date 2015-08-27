
public class Boxer1 {
	Integer i=5;
	int x;
	public Boxer1(int y){
		x=i+y;
		System.out.println(x);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Boxer1(new Integer(4));
	}

}
