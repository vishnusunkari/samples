package prog.misc;

public class MergeAndFindK {

	public static void main(String[] args) {
		int a[] = {12, 9, 5, 5, 1};
		int b[] = {11, 11, 8, 5, 3};
		System.out.println("Kth element of sorted arrays is : " + mergeAndFindK(a, b, 9));

	}
	
	public static int mergeAndFindK(int a[], int b[], int kth) {
		kth = kth-1;
		int length = a.length + b.length;
		int [] c = new int [length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
				if(a[i] >= b[j]){
					if(kth == k){
						return (c[k]=a[i]);
					}
					c[k++] = a[i++];					
				} else if(b[j] >= a[i]){
					if(kth == k){
						return (c[k]=b[j]);
					}
					c[k++]=b[j++];	
				} 
		}
		while(i<a.length){			
			if(kth == k){
				return (c[k] = a[i]);
			}
			c[k++] = a[i++];
		}
		while(j<b.length){
			if(kth == k){
				return (c[k] = b[j]);
			}
			c[k++] = b[j++];
		}
		return -1;		
	}


}
