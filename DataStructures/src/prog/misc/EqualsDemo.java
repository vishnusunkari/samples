package prog.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualsDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Collections.sort(list);

	}

}
