import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(567890);
		
		Iterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			int elt = itr.next();
			if(elt == 567890) {
				System.out.println("Removing elt from list : " + elt);
				itr.remove();
			} else {
				System.out.println(elt);
			}
		}
		
		StringBuilder strBuilder = new StringBuilder();
		System.out.println("Default capacity of StringBuilder: " + strBuilder.capacity());
		// Look into StringBuilder ensureCapacity method
		strBuilder.ensureCapacity(100);
		System.out.println("After ensureCapacity(100) the capacity of StringBuilder: " + strBuilder.capacity());

	}

}
