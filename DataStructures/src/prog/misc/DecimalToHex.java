package prog.misc;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		System.out.println("Input value for n: ");
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();
		System.out.println("Hex Value of " + n + " is " + Integer.toHexString(n));

	}

}
