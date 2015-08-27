import java.util.Scanner;


public class StringSplit {

	public static void main(String[] args) {
		
		System.out.println("Input a sentance : \n ");
		Scanner scanner = new Scanner(System.in);
		String sentence  = scanner.nextLine();
		String [] tokens = sentence.split(" ");
		System.out.println("No. of tokens : " + tokens.length);
		for(String token : tokens) {
			System.out.println(token);
		}
		

	}

}
