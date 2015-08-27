package prog.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUncoupled {

	public static void main(String[] args) {
		int []a = {1, 3, 12, 3, 8, 5, 7, 7, 1, 8, 5};
		//findUncoupled(a);
		//int uncoupledInt = findUncoupled(a);
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		System.out.println("Uncoupled int using Set: " + findUncoupledUsingSet(a));
		System.out.println("Uncoupled int using xor: " + findUncoupledUsingXor(a));
	}

	private static int findUncoupledUsingSet(int[] a) {
		boolean flag = true;
		Set<Integer> intSet = new HashSet<Integer>();			
		for(int i : a) {
			/*for(int i=0;i<a.length;i++) {
			    flag = intSet.add(a[i]);
				if(flag==false) {
					intSet.remove(a[i]);
				}
			}*/
			if(intSet.contains(i)) {
				intSet.remove(i);
			} else {
				intSet.add(i);
			}
		}
		//System.out.println("Uncoupled int : " + intSet.toString());
		for(int i : intSet) {
			return i;
		}		
		return 0;
	}
	
	private static int findUncoupledUsingXor(int[] a){
		int temp=a[0];
		for(int i=1;i<a.length;i++){
			temp^=a[i];
			//System.out.println("temp : " + temp);
		}
		return temp;
		
	}

}
