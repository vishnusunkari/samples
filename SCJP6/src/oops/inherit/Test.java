package oops.inherit;

import oops.inherit.superpack.*;
import oops.inherit.superpack.subpack.SubbClassInDiffPack;
public class Test {

	public static void main(String[] args) {
		SuperrClass superrClass = new SuperrClass();
		superrClass.superClassMethod();
		
		SubbClassInSamePack subbClassInSamePack = new SubbClassInSamePack();
		subbClassInSamePack.subbClassInSamePackMethod();
		
		DiffClassInSamePack diffClassInSamePack = new DiffClassInSamePack();
		diffClassInSamePack.diffClassinSamePackMethod();
		
		SubbClassInDiffPack subbclassindiffpack = new SubbClassInDiffPack();
		subbclassindiffpack.subbClassInDiffPackMethod();

	}

}
