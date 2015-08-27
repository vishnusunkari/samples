package alg.recursion;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public Test(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Character charcter = new Character('a');
	}
	
	

	/**
	 * Create a class that implements the Iterator interface and whose constructor
	 * takes a List<Character> as a parameter.  The iterator shall return each character
	 * in the list that is an upper case character.
	 * Iterator javadoc screen shot:  http://www.screencast.com/t/K0cbBIMS
	 * You may use the Character.isUpperCase() static method to check members of the list.
	 * You may not use the input.iterator().
	 *
	 * Example:  'a', 'X', 'b', 'Y', 'c', 'Z', 'd'
	 *
	 * hasNext() ---> true
	 * next() ---> 'X'
	 * hasNext() ---> true
	 * next() ---> 'Y'
	 * hasNext() ---> true
	 * next() ---> 'Z'
	 * hasNext() ---> false
	 */


	public class UpperCaseIterator implements Iterator<Character>
	{
	    
	    List<Character> listOfChars = new LinkedList<Character>();
	    char currentChar;
	    
	    public UpperCaseIterator(List<Character> input)
	    {   
	        if(input != null) {
	            listOfChars = input;
	            
	        }
	    }


	    public boolean hasNext()
	    {
	        listOfChars.get(index)
	    }


	    public Character next()
	    {
	        if(listOfChars.
	    }


	    public void remove()
	    {
	        
	    }
	}
}
