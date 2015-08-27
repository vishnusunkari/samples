/*
 * Demo of PECS by Joshua Bloch
 */

package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.lang.*;

public class GenericsTest {

	public static void main(String[] args) {
	
		List <Integer> intCollection = new ArrayList<Integer>();
		intCollection.add(21);
		intCollection.add(51);
		intCollection.add(61);
		addProducerExtends(intCollection);
		List <Double> doubleCollection = new ArrayList<Double>();
		doubleCollection.add(21.2);
		doubleCollection.add(51.2);
		doubleCollection.add(61.2);
		addProducerExtends(doubleCollection);
		List <Float> floatCollection = new ArrayList<Float>();
		floatCollection.add((float) 21.10);
		floatCollection.add((float) 51.1);
		floatCollection.add((float) 61.1);
		addProducerExtends(floatCollection);
		List <Object> objCollection = new ArrayList<Object>();
		objCollection.add(100);
		objCollection.add(200);
		//You cannot do the next line
		//addProducerExtends(objCollection);
		
		List <Number> collectionOfNumbers = new ArrayList<Number>();
		collectionOfNumbers.add(129);
		collectionOfNumbers.add(2);
		collectionOfNumbers.add(3);
		collectionOfNumbers.add(3.5);
		collectionOfNumbers.add((short) 6);
		addConsumerSuper(collectionOfNumbers);
				
		sum(collectionOfNumbers);
	}

	//Demo of PE
	private static void addProducerExtends(List<? extends Number> collectionOfNumbers) {
		List <Object> collectionOfObjects = new ArrayList<Object>();
		collectionOfObjects.addAll(collectionOfNumbers.subList(0, 2));
		System.out.print("addProducerExtends: ");
		System.out.print(collectionOfObjects);
		System.out.println();
	}
	//Demo of CS
	private static void addConsumerSuper(List<? super Number> collectionOfNumbers) {
		collectionOfNumbers.add(10);
		System.out.print("addConsumerSuper: ");
		System.out.print(collectionOfNumbers);
	}

	//Demo of PE
	private static void sum(List<? extends Number> collectionOfNumbers) {
		Double sum = 0.0;
		ListIterator listItr = collectionOfNumbers.listIterator();
		while(listItr.hasNext()){
			sum = sum+Double.parseDouble(listItr.next().toString());
		}		
		System.out.println("Sum of Collection is : " + sum);
	}
	
}
