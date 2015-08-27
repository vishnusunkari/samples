package oops.inherit.superpack;

public class DiffClassInSamePack {
	
	public void diffClassinSamePackMethod(){
		System.out.println("diffClassinSamePack SuperrClass().publicstr: " + new SuperrClass().publicstr);
		System.out.println("diffClassinSamePack SuperrClass().protectstr: " + new SuperrClass().protectstr);
		System.out.println("diffClassinSamePack SuperrClass().defaultstr: " + new SuperrClass().defaultstr);

		/*
		 * You cannot do following
		 */
		//System.out.println("defaultstr: " + defaultstr);
		//System.out.println("privatestr: " + privatestr);
	}
}
