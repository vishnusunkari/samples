package prog.misc;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		Queue<Double> pq = new PriorityQueue<Double>();
		pq.add(4.5);
		pq.add(9.3);
		pq.add(1.7);
		pq.add(1.7);

		System.out.println("Frequency of 1.7 in pq : " + Collections.frequency(pq, new Double(1.7)));
		while(true) {
		   Double d = pq.poll();
		   if (d == null) break;		   
		   System.out.println(d);		   
		}

	}

}
