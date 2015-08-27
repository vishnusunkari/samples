package alg.recursion;

public class Fibonacci {
	
	public static void main(String[] args) { 

		int N = 20;
  
		int f = 0, g = 1;
	    for (int i = 1; i <= N; i++) {
	    	f = f + g;
	        g = f - g;
	        System.out.println("Fibonacci of "+i+": " + f);
	    }
	    System.out.println("Fibonacci of "+N+" using for loop: " + f);
	}

}