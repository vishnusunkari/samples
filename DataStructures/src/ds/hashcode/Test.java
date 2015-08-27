package ds.hashcode;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Dictionary construction
		WordDictionary dict = new WordDictionary();
		dict.insert(new Word("hi"), new Definition("hello"));
		dict.insert(new Word("it"), new Definition("that thing"));
		dict.insert(new Word("no"), new Definition("Not possible"));
		dict.insert(new Word("ny"), new Definition("Not at all possible"));
		dict.insert(new Word("by"), new Definition("by the way"));
		dict.insert(new Word("be"), new Definition("be like you want to be"));
		dict.insert(new Word("ci"), new Definition("see"));
		dict.insert(new Word("di"), new Definition("die for a cause"));
		//dict.insert(new Word("binoculars"), new Definition("device to see distant objects"));
		dict.insert(new Word("bi"), new Definition("two"));
		
		System.out.println("Enter the word : ");
		Scanner scan = new Scanner(System.in);		
		System.out.println("Definition is : " + dict.find(new Word(scan.next())));
		
		
	}

}
