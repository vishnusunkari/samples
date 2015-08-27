package vis.javaspecific.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

public class JavaCollectionDemo {

	public static void main(String[] args) {
		String [] arrayInd = {"hyd", "wgl", "knr"};
		String [] arrayUsa = {"sm", "col", "la"};
		List strList = Arrays.asList(arrayInd);
		//strList.add("cool");
		System.out.println(strList.toString());
		
		for(String str : arrayInd) {
			System.out.println(str);
		}
		String [] destArray = new String [6];
		List<String> destList = new ArrayList<>();
		Collections.addAll(destList, arrayInd);
		Collections.addAll(destList, arrayUsa);
		
		//strList.toArray(array);
		//Collections.shuffle(destList, new Random());
		Collections..shuffle(destList);
		System.out.println(destList.toString().replaceAll("\\[|\\]", ""));
		//destList.toArray(destArray);
		//System.out.println(Arrays.toString(destArray).replaceAll("\\[|\\]", ""));
		

	}

}
