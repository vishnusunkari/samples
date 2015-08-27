package oops.inherit.superpack;

public class SubbClassInSamePack extends SuperrClass {

	public void subbClassInSamePackMethod(){
		System.out.println("SubbClassInSamePack publicstr: " + publicstr);
		System.out.println("SubbClassInSamePack protectstr: " + protectstr);
		System.out.println("SubbClassInSamePack defaultstr: " + defaultstr);
		
		/*
		 * You cannot do following
		 */
		
		//System.out.println("privatestr: " + privatestr);
	}
	
	/*
	 * You can only make the visibility (ie access specifier)
	 * of overriding method more public or keep it same.  
	 * You cannot restrict it.
	 */
	protected void superClassMethod2(){
		
	}
}
