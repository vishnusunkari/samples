package ds.sorting;

public class QuickSort {
	private int[] a;
	private int arrayLength;
	
	public void sort(int[] values){
		if(values == null || values.length==0){
			System.out.println("Null array !");
			return;
		}
		this.a = values;
		arrayLength = values.length;
		quickSort(0, arrayLength-1);
	}
	
	private void quickSort(int low, int high){
		if(low<high){
			
			//randomly selecting a pivot elt and putting it in the last elt of the array
			int pivotIndex = low + (int) Math.random()*((high-low)+1);
			System.out.println("pivot : a[" + pivotIndex + "] : " + a[pivotIndex] );
			System.out.println("Swapping pivot with a[high]");
			int pivot = a[pivotIndex];
			a[pivotIndex] = a[high];
			a[high] = pivot;
			printArray();
			int i = low-1;
			int j = high;
			//continue until i>=j
			do{
				//continue till it comes across elt >=pivot
				do{i++;} while(a[i]<pivot);
				//continue till it comes across elt<=pivot and also check for j going into -ive index
				//you do not have to check for i > array bounds as the outer while loop takes care of this
				do{j--;}while(a[j]>pivot && j>low);
				if(i<j){
					swap(i,j);
					printArray();
				}
				
			}while(i<j);			
			//finally swapping pivot back to middle elt
			System.out.println("Swapping a[high], a[" + i + "]");
			a[high] = a[i];
			a[i] = pivot;			
			printArray();
			//recursively apply quicksort to partitioned arrays with pivot in middle
			quickSort(low, i-1); 
			quickSort(i+1, high);
		}
	}
	
	private void swap(int i, int j) {
		System.out.println("Swapping : " + a[i] + " , " + a[j]);
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void printArray(){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ "  ");
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		int a[] = {12, 1, 24, 6, 789, 6, 6, 234, 113, 6, 0, 89, 999, 1123, 602, 6};
		System.out.println("Input Array : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ "  ");
		}
		System.out.println();
		//int a[]={1, 0};
		QuickSort sorter = new QuickSort();
		sorter.sort(a);
		System.out.println("Ouput Array : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ "  ");
		}			
	}
}
