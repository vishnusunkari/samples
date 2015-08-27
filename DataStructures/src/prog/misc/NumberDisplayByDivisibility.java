package prog.misc;

import org.apache.commons.lang3.StringUtils;


public class NumberDisplayByDivisibility {

	public static void main(String[] args) {
		
		for (int i =1;i<101;i++) {
			String str = Integer.toString(i);
			if(StringUtils.contains(str, '7')) {
				System.out.println("Fesen");
			} else if (i%5 == 0  && i%3 == 0) {
				System.out.println("Fefteen");
			} else if (i%5 == 0) {
				System.out.println("Fef");
			} else if (i%3 == 0 ) {
				System.out.println("Fethr");
			} else {
				System.out.println(i);
			}
		}

	}

}
