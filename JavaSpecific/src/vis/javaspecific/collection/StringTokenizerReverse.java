package vis.javaspecific.collection;

import java.util.StringTokenizer;

public class StringTokenizerReverse {

	public static void main(String[] args) {
		/*
		 * Reverse string by word using StringTokenizer example. This example
		 * shows how to reverse a line or sentense using Java StringTokenizer
		 * and String classes.
		 */

		
		
		String strLine = "Java Reverse string by word example";

		// specify delimiter as " " space
		StringTokenizer st = new StringTokenizer(strLine, " ");

		String strReversedLine = "";

		while (st.hasMoreTokens()) {
			strReversedLine = st.nextToken() + " " + strReversedLine;
		}

		System.out.println("Reversed string by word is : " + strReversedLine);

	}

}
