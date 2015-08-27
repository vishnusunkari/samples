package prog.misc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Knowledge is wisdom";
		System.out.println("Reversed String : "+ revString(str));
		
		
		System.out.println("Reversed String is : " + reverse(str));
		String [] strArray = str.split("\\s");
		//String []strArray ={" Knowledge ", " is ", " wisdom "};
		StringBuilder strbuilder = new StringBuilder(str);				
		
		List <String> list = Arrays.asList(strArray);
		System.out.println(list);
		String []strArray2;
		strArray2 = (String[]) list.toArray();

		for(String str2 : strArray2){
			System.out.println(str2);
		}
		
		Dictionary dict = new Hashtable();
		dict.put("key1", "elt1");
		
		
		//System.out.println(str);		
		//reverseArray(strArray);
		System.out.println(strbuilder.reverse());
		//System.out.println(str);
		//System.out.println(reverse(str));
	}
	
	public static String reverse(String orig)
	{
	    char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    return new String(s);
	}
	
	
	
	
	
	public char[] revvvString(char[] str){
		
		int len = str.length;
		for(int i=0; i<len/2; i++){
			char temp = str[i];
			str[i] = str[len-1-i];
			str[len-1-i]=temp;
		}
		return str;		
	}
	
	
	public static void  reverseArray(String[] orig){		
		List list = Arrays.asList(orig);
		ListIterator listitr = list.listIterator(list.size());
		while(listitr.hasPrevious())
			System.out.print(listitr.previous());
	}
	
	public static String revString(String str) {
		int i, len = str.length();
		StringBuilder dest = new StringBuilder(len);

		for (i = (len-1); i>=0; i--){
			dest.append(str.charAt(i));
		}
		
		return dest.toString();
		
	}

}
