package prog.misc;

public abstract class SubMiscTrys extends MiscTrys {
	private int i=0;
	protected int j=0;
	//incorrect
	//public static abstract void myMethod();
	
	public abstract void myMethod();
	
	private static void myMethod2(){
		
	}
	public SubMiscTrys(){
		super(50);
		//super(25);
	}
	
}
