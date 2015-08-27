package vis.javaspecific.collection;

import java.util.Map;
import java.util.WeakHashMap;
/*
 * The output will show a lot of 1s and 0s (instead of increasing Map size). Since the 
 * String.valueOf(i) would create a temporary String instance which no one else references 
 * (but the objectMap), the System.gc() calls will Garbage collect the String instance,
 * essentially removing it from the objectMap.
 */

public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> objectMap = new WeakHashMap<Object, Object>();
		/*for (int i = 0; i < 1000; i++) {
			objectMap.put(String.valueOf(i), new Object());
			System.gc();
			System.out.println("Map size :" + objectMap.size());
		}*/
		
		for (int i = 0; i < 1000; i++) {
			objectMap.put(i, new Object());
			System.gc();
			System.out.println("Map size :" + objectMap.size());
		}

	}

}
