package prog.misc;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		System.out.println("Enter the number : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++){
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println("\n Factorial of " + n + " is : " + fact);
	}

}
