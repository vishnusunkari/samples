package ds.sorting;

public class MergeSortTest1 {

	public static void main(String[] args) {
		int [] arr = {321, 150, 466, 912, 200, 12999, 10901, 623678, 123434};
		System.out.println("Unsorted array is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ ",  ");
		}
		arr = mergeSort(arr);
		System.out.println("\n\n\nSorted array is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " < ");
		}
	}
	
	public static int[] mergeSort(int [] arr){
		int arrLength = arr.length;
		if(arrLength > 1){
			int arrLength1 = arrLength/2;
			int arrLength2 = (arrLength%2 == 1) ? (arrLength1 + 1) : arrLength1;
			int []arr1 = new int[arrLength1];
			int []arr2 = new int[arrLength2];						
			for(int i =0;i<arrLength1;i++){
				arr1[i] = arr[i];
			}
			for(int i=arrLength1;i<arrLength;i++){
				arr2[i-arrLength1] = arr[i];
			}
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);
			
			int i=0,j=0,k=0;
			
			while(arr1.length != j && arr2.length != k) {
				if(arr1[j]<arr2[k]){
					arr[i] = arr1[j];
					i++;
					j++;					
				} else {
					arr[i] = arr2[k];
					i++;
					k++;
				}
			}
			while(arr1.length !=j){
				arr[i] = arr1[j];
				i++;
				j++;
			}
			while(arr2.length !=k){
				arr[i] = arr2[k];
				i++;
				k++;
			}
		}
			
		return arr;
		//mergeSort(arr[mid]);
			
	}

}
