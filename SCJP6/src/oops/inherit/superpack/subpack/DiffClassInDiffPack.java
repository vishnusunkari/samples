package oops.inherit.superpack.subpack;

import oops.inherit.superpack.SuperrClass;

public class DiffClassInDiffPack {
	
	public void diffClassinDiffPackMethod(){
		System.out.println("diffClassinDiffPack SuperrClass().publicstr: " + new SuperrClass().publicstr);
		//System.out.println("protectstr: " + new SuperrClass().protectstr);
		/*
		 * You cannot do following
		 */
		//System.out.println("defaultstr: " + defaultstr);
		//System.out.println("privatestr: " + privatestr);
	}

}
