package ds.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 321, 150, 466, 912, 200, 12999, 10901, 623678, 123434 };
		System.out.println("Unsorted array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",  ");
		}
		arr = insertionSort(arr);
		System.out.println("\n\n\nSorted array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " < ");
		}

	}

	public static int[] insertionSort(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i; (j > 0 && a[j - 1] > a[j]); j--) {
				swap(a, j - 1, j);
			}
		return a;
	}

	private static void swap(int x[], int a, int b) {
		int t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

}
