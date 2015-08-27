package prog.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		//Create two objects of different types
		
		List listObj = new ArrayList(3);
		listObj.add(10);
		listObj.add(20);
		listObj.add(30);

		Set setObj = new HashSet();
		setObj.add("a");
		setObj.add("b");
		setObj.add("c");
		
		doSomethingByObjectType(listObj, setObj);
	}

	private static void doSomethingByObjectType(Object obj1, Object obj2) {
		
		Class obj1Class = obj1.getClass();
		System.out.println("obj1Class : " + obj1Class);
		Class obj2Class = obj2.getClass();
		System.out.println("obj2Class : " + obj2Class);
		
		for(Method method : obj1Class.getDeclaredMethods()){
			System.out.println("method: " + method);
		} 
		List obj3 = new ArrayList();
		System.out.println(obj3 instanceof Object);
						
	}

}
