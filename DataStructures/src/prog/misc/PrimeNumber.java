package prog.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Input value for n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrimes(n);
		//printPrimes2(n);
		
	}

	private static void printPrimes(int n) {
		/*boolean [] prime = new boolean [n+1];
		for(int i=2;i<=n;i++){
			prime[i] = true;
		}
		for(int divisor=2;divisor*divisor<=n; divisor++){
			if(prime[divisor]){
				for(int i=2*divisor;i<=n;i=i+divisor){
					prime[i] = false;
				}
			}
		}
		for(int i=2;i<=n;i++){
			if(prime[i]){
				System.out.println("  " + i);
			}
		}*/
		
		for(int i=3;i<=n;i+=2){
			if(isPrime(i)){
				System.out.println(i + " is Prime");
			}
		}
		
	}
	
	private static boolean isPrime(int n){
		for(int i=3;i*i<=n;i+=2){
			if(n%i==0){		
				return false;
			}			
		}
		return true;
	}
	
	/*private static void printPrimes2(int n) {
		List nonPrime = new ArrayList();
		for(int divisor=2;divisor*divisor<=n;divisor++){
			for(int i=2*divisor,j=0;i<=n;i=i+divisor){
				nonPrime.add(i);
			}
		}
		for(int i=2;i<n;i++){
			if(nonPrime.contains(i)){
				
			} else {
				System.out.println("  " + i);
			}
		}
	
	}*/

}
