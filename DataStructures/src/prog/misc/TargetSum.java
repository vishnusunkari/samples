package prog.misc;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		int []a = {1, 3, 12, 3, 8, 5, 7, 7, 1, 8, 5};
		System.out.println("Given array : " + Arrays.toString(a));
		int target=11;
		System.out.println("Target sum exists : " + targetSum(a, target));
	
	}

	private static boolean targetSum(int []a, int  target) {
		Arrays.sort(a);
		System.out.println("Sorted array : " + Arrays.toString(a));
		int left = 0;
		int right = a.length-1;
		int sum=0;
		while (left < right) {
			sum = a[left]+a[right];			
			if(sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				System.out.println("Target found at left index : " + left + " and right index : " + right);
				return true;
			}			
		}
				
		return false;
	}
}
