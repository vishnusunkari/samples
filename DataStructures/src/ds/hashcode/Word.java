package ds.hashcode;

public class Word {
	public static final int LETTERS =26;
	public static final int WORDS = LETTERS * LETTERS;
	private String word;
	
	public Word(String word){
		this.word = word;
	}
	
	public int hashCode(){
		return LETTERS*(word.charAt(0)-'a')+(word.charAt(1)-'a');
	}

	/*public static void main(String[] args){
		char [] smallAlphabets = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
									'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
		char [] bigAlphabets = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		String word1;
		Word word2;
		for(int i=0; i<smallAlphabets.length;i++){
			for(int j=0;j<smallAlphabets.length;j++){
				word1 = "" + smallAlphabets[i] + smallAlphabets[j];
				word2 = new Word(word1);
				System.out.println(word1 + ":  "+ word2.hashCode());
			}
		}
	}*/
}
