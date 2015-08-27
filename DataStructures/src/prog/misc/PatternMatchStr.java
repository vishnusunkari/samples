package prog.misc;

import java.util.Arrays;

import org.apache.commons.lang.StringUtils;

public class PatternMatchStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pattern = "1?00?101";
		System.out.println("Pattern is : 1?00?101");
		System.out.print(Arrays.toString(displayStrings(pattern)));
		

	}
	
	public static String [] displayStrings(String pattern) {
		String tempPattern = pattern;
		int count=0;
		int j=0;
		int position[]=new int [pattern.length()];
		for(int i=0; i<pattern.length()-1;i++){
			if(pattern.charAt(i) == '?') {
				count+=1;
				position[j] = i;
				j++;
			}
		}
		int N= twoPowerOfN(count);
		String[] output = new String [N];
		char [] charArray = pattern.toCharArray();
		char l='0';
		for(int i=0;i<N;i++){	
			for(int k=0;k<count;k++) {				
				charArray[position[k]] = (char) 1;
			}
			if(l == '1')
				l = '0';
			else 
				l = '1';
			output[i] = String.valueOf(charArray);
		}
		return output;
		
		/*if(!StringUtils.isEmpty(pattern)) {
			char [] charArray = pattern.toCharArray();			
			for(int i=0;i<charArray.length;i++) {
				if(charArray[i] == '?'){
					charArray[i] = '0';
				}
			}
		
		}*/
			
		//return new String[] {""};
	}
	
	public static int twoPowerOfN(int n) {
		int product =1;
		for(int i=1;i<=n;i++){
			product*=2;
		}
		return product;
	}

}
