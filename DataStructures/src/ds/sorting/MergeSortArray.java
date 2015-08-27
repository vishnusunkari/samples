package ds.sorting;

public class MergeSortArray {
	public int [] arr;
	private int arrLength; 
	public static int count = 0;
	public int i=25;
	public MergeSortArray(){
		arr = new int []{321, 150, 466, 912, 200, 12999, 10901, 623678, 123434, 0};
	}
	
	public void display(){
		for(int i=0;i<this.arr.length;i++){
			System.out.print(this.arr[i]+ ",  ");
		}
	}
	
	
	public static void main(String[] args) {
		
		MergeSortArray mergeSortArray = new MergeSortArray();
		
		System.out.println("Unsorted array is: ");
		mergeSortArray.display();
		System.out.println();
		mergeSortArray.mergeSort();

		System.out.println("\n\n\nSorted array is: ");
		mergeSortArray.display();
		//for(int i=0;i<arr.length;i++){
		//	System.out.print(arr[i]+ " < ");
		//}
	}
	
	public void  mergeSort(){
		int [] tempArray = new int[this.arr.length];
		int n=5;
		recursivefn(n, "c");
		System.out.println("Count : " + count);
		count=0;
		//recursiveMergeSort(tempArray, 0, this.arr.length, 2);			
	}

	public static void recursivefn(int n, String x){
		if(n==1) {
			count++;
			System.out.println("n is: "+x+ n);
			return;
		}
		else {
			count++;
			recursivefn(n-1, "a");
			recursivefn(n-1, "b");
			//recursivefn(n-1);
			System.out.println("n is: "+x + n);
		} 
	}
	
	private void recursiveMergeSort(int[] tempArray, int low, int high, int pointer) {
		int mid = (low+high)/2;
		System.out.println("low - mid - high : " + low + "-" + mid + "-" + high);
		if(low==high) {
			System.out.println("low - mid - high : " +  + low + "-" + mid + "-" + high);
			System.out.println("low == high");
			return;
		} else{

			System.out.println("low != high");
			//System.out.println("before 1st low - mid - high : " + low + "-" + mid + "-" + high);
			recursiveMergeSort(tempArray, low, mid, 0);			
			//System.out.println("after 1st low - mid - high : " + low + "-" + mid + "-" + high);
			recursiveMergeSort(tempArray, mid+1, high, 1);
			//System.out.println("after 2nd low - mid - high : " + low + "-" + mid + "-" + high);

			merge(tempArray, low, mid, high, pointer);
		}
		
	}

	private void merge(int [] tempArray, int low, int mid, int high, int pointer) {
		count++;
		
		if(pointer==1){
			System.out.println("Second recursiveMergeSort()");
		} else if (pointer==0 ){
			System.out.println("First recursiveMergeSort()");
		} else {
			System.out.println("Outer recursiveMergeSort()");
		}
		System.out.println("low - mid - high : " +  + low + "-" + mid + "-" + high);
		// TODO Auto-generated method stub
		
	}
}
