package ds.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDS {

	public static void main(String[] args) {
		//Character a [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		//List<Character> list = Arrays.asList(a)   ;
		//the following gives java.lang.UnsupportedOperationException
		//list.add('h');
		//list.add('i');
		//System.out.println(list.toString());
		
		copyArrays();
		
		
		
	}

	private static void copyArrays() {
		List<Character> list1  = createList(6);
		System.out.println(list1.toString());
		
		List<Character> list2  = createList(3);
		System.out.println(list2.toString());
		
		list1.addAll(list2);		
		System.out.println(list1.toString());
		
		list1.removeAll(list2);
		System.out.println(list1.toString());
		
		list1.retainAll(list2);
		System.out.println(list1.toString());
		
		
		
		
		
	}

	private static List<Character> createList(int n) {
		List<Character> list = new ArrayList(n);
		for(int i=65;i<65+n;i++){
			list.add((char)i);
		}
		return list;
	}

}
