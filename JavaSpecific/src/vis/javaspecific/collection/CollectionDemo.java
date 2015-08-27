package vis.javaspecific.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * @author sunkav01
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		/*Integer a[] = {5, 2, 10, 8, 5, 3, 12, 2, 5};
		List<Integer> list = Arrays.asList(a);
		System.out.println(Collections.frequency(list, 5));
		
		String str = "CATAC";
		System.out.println(str.indexOf('T'));
		String str2 = "";*/
		
		Map <Integer, Integer> identityMap = new IdentityHashMap();
		identityMap.put(1, 10);
		identityMap.put(2, 20);
		identityMap.put(1, 100);
		
		  Multimap<String, String> myMultimap = ArrayListMultimap.create();
		   
		  // Adding some key/value
		  myMultimap.put("Fruits", "Bannana");
		  myMultimap.put("Fruits", "Apple");
		  myMultimap.put("Fruits", "Pear");
		  myMultimap.put("Vegetables", "Carrot");
		   
		  // Getting the size
		  int size = myMultimap.size();
		  System.out.println(size);  // 4
		   
		  // Getting values
		  Collection<String> fruits = myMultimap.get("Fruits");
		  System.out.println(fruits); // [Bannana, Apple, Pear]
		
		for(Integer key : identityMap.keySet()) {
			System.out.println("key : " + key + "; value : " + identityMap.get(key));
		}
		
		

	}

}
