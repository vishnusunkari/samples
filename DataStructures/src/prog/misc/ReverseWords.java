package prog.misc;

public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "welcome to coding algorithms";
		System.out.println("Original words : " + str);
		char[] arr = str.toCharArray();
		System.out.println("Reversed words : ");
		System.out.println(reverseWords(arr));
	}
	
	
	public static char[] reverseWords(char [] arr) {
	    // reverse the string
	    
	    reverse(arr, 0, arr.length / 2, arr.length);
	     
	    // reverse words of a string
	    int wordIdx = 0;
	    int wordMidIdx = 0;
	    int prevWordLastIdx = 0;
	 
	    // outer loop to track spaces
	    for (int sentenceIdx = 0; sentenceIdx < arr.length; sentenceIdx++) {
	        if (arr[sentenceIdx] != ' ')
	            continue;
	 
	        wordIdx = prevWordLastIdx;
	        int wordLastIdx = sentenceIdx;
	        wordMidIdx = (sentenceIdx + wordIdx) / 2;
	        // reverse each word in a string
	        reverse(arr, wordIdx, wordMidIdx, wordLastIdx);
	        prevWordLastIdx = sentenceIdx + 1;
	    }
	 
	    // reverse last word
	    wordIdx = prevWordLastIdx;
	    wordMidIdx = (arr.length + wordIdx) / 2;
	    reverse(arr, wordIdx, wordMidIdx, arr.length);
	     
	    return arr;
	}
	 
	private static void reverse(char[] arr, int wordIdx, int wordMidIdx,
	        int wordLastIdx) {
	    for (; wordIdx < wordMidIdx; wordIdx++) {
	        // swap first letter with the last letter in the
	        char tmp = arr[wordIdx];
	        arr[wordIdx] = arr[wordLastIdx - 1];
	        arr[wordLastIdx - 1] = tmp;
	        wordLastIdx--;
	    }
	}

}
