package oops.inherit.superpack.subpack;

import oops.inherit.superpack.SuperrClass;

public class SubbClassInDiffPack extends SuperrClass {
	
	public void subbClassInDiffPackMethod(){
		System.out.println("SubbClassInDiffPack publicstr: " + publicstr);
		System.out.println("SubbClassInDiffPack protectstr: " + protectstr);
		//System.out.println("SubbClassInDiffPack defaultstr: " + new SuperrClass());
		/*
		 * You cannot do following
		 */
		//System.out.println("defaultstr: " + defaultstr);
		//System.out.println("privatestr: " + privatestr);
	}
	
}
