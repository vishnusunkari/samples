package prog.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		Integer a[] = {1, 3, 5, 7, 9, 10};
		List <Integer> intList = Arrays.asList(a);
		//Collection col = new Collection();
		
		Iterator itr = intList.iterator();
		System.out.println("List : ");
		while(itr.hasNext()) {
			Integer item = (Integer) itr.next();
			System.out.print(item + ", ");	
			if (item == 5) {
				itr.remove();
			}			
		}		
		
		itr = intList.iterator();
		System.out.println("List : ");
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		
		List list = new ArrayList();
		list.add("123");

		boolean contains123 = list.contains("123");
	}

}
