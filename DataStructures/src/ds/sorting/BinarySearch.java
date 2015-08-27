package ds.sorting;
import java.util.Arrays;

public class BinarySearch {
    private BinarySearch() { }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = hi / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {

        // read the integers from a file
        int [] numarray = {1, 12, 4, 6, 19}; 
        int key = 6;

        // sort the array
        Arrays.sort(numarray);

       if (rank(key, numarray) == -1)
           System.out.println("Not found");
       else 
    	   System.out.println("Found : " + key);
    }
}
