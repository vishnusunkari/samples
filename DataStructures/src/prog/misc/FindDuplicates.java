package prog.misc;

import java.lang.Math;

/*
 * Find all the repeating elements of an array 
 * when the value of all elements of the array 
 * are less than the total size of the array
 */

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[] = { 5, 5, 5, 5, 5, 5, 5 };
		int arr_size = arr.length;
		printRepeating(arr, arr_size);
	}

	private static void printRepeating(int[] arr, int size) {
		int i;
		System.out.println("The repeating elements are: \n\n");
		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.println(Math.abs(arr[i]));
		}
	}

}
