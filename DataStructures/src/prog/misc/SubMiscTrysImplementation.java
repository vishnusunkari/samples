package prog.misc;

public class SubMiscTrysImplementation {
	
	int x=100;
	public void myMethod(){
		InnerInterface innerInt1 = new InnerInterface(){
			public void myMethod2(){
				
			}
		};
	}

	private interface InnerInterface{
		public void myMethod2();
	}
}

