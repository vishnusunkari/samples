
public class ClassA {

	public void methodA(){
		ClassB classB = new ClassB();
		System.out.println(classB.getValue());
	}
}

class ClassB {
	public ClassC classC =  new ClassC();
	public String getValue(){
		return classC.getValue();
	}
}

class ClassC{
	public String value;
	public String getValue(){
		value = "ClassB";
		return value;
	}
}