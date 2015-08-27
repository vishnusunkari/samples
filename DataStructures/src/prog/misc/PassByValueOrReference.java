package prog.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PassByValueOrReference {

	public static void main(String[] args) {
		Map <Integer, Integer> mappy = new HashMap <Integer, Integer>();
		mappy.put(1, 100);
		mappy.put(2, 200);
		mappy.put(3, 300);
		Map<Integer, Integer> processedMappy = passMethod(mappy);
		System.out.println(processedMappy.keySet() + " : " + processedMappy.entrySet().toString());
		for(Entry<Integer, Integer> entry : processedMappy.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + "\n");
		}
		

	}

	private static Map passMethod(Map<Integer, Integer> mappy) {
		mappy.put(4, 400);
		mappy.put(3, 500);
		return mappy;
	}

}
