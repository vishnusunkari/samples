import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

	/*
	 * Stack
	 * 
	 * There is a stack in jdk appeared there from origins – class Stack, but
	 * it’s not recommended to use it, it’s complex and strange: it inherits
	 * from Vector, so is based on Dynamic Array and synchronized. Why a simple
	 * stack needs all of that and why it’s not just an interface – is not clear
	 * (discussed many times: 1, 2), but it seems just an architecture mistake,
	 * the same as with Vector itself. Btw, JDK authors themselves suggest using
	 * Deque instead. Deque – an interface (api) of double-ended queue (LIFO +
	 * FIFO in O (1)), which includes the stack operations (push, pop, isEmpty,
	 * size) and is available in the jdk not so far (1.6+). Of course it’d be
	 * more logical to put these stack operations in an interface Stack, and
	 * e.g. let Deque inherit it, but as Stack was already present, and backward
	 * compatibility is the “holy grail” of java – they had to sacrifice a
	 * normal design. Implementations of Deque are ArrayDeque and LinkedList,
	 * who are also implementors of an usual queue – so we’ll discuss this
	 * later.
	 */

public class DequeueImpl {

	public static void main(String[] args) {
		Deque dequeA = new LinkedList();

		dequeA.add("element 0");
		dequeA.add("element 1");
		dequeA.add("element 2");

		//access via Iterator
		Iterator iterator = dequeA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		}

		//access via new for-loop
		for(Object object : dequeA) {
		    String element = (String) object;
		}
		
		//Removing elements
		Object firstElement = dequeA.remove();
		Object removedfirstElement = dequeA.removeFirst();
		Object lastElement  = dequeA.removeLast();
		
	}

}
