package prog.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DumpMethods {

	public static void main(String[] args) {
		try {
			//Thread.dumpStack();
			Class c = Class.forName("java.util.Stack");
			Method m[] = c.getMethods();//.getDeclaredMethods();
			Field fields[] =c.getFields();
			System.out.println("--------Methods of java.util.Stack --------");
			for(int i=0;i<m.length;i++){
				System.out.println(m[i].toString());
			}
			System.out.println("--------Fields of java.util.Stack----------");
			for(int i=0;i<fields.length;i++){
				System.out.println(fields[i].toString());
			}
			//Thread.dumpStack();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
