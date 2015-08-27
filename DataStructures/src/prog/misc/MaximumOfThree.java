package prog.misc;

public class MaximumOfThree {

	public static void main(String[] args) {
		int a=101, b=101, c=100;
		int max= max(a,b,c);
		System.out.println("Maximum: " + max(a,b,c));

	}

	private static int max(int a, int b, int c) {
		int m;
		if(a>b){
			m=a;
		} else {
			m=b;
		}
		if(c>m){
			return c;
		}else{
			return m;
		}
		
	}

}
