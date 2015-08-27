
public class ParseFloat {

	public static void parse(String str){
		float f = 0;
		try{
			 f=Float.parseFloat(str);
		
		} catch(NumberFormatException nfe){
			f=0;
		} finally {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		String str3 = "Hello World !";
		String str4 = "Babye World!";
		String 	str2 = (true)? str3 : str4; 
		System.out.println(str2);
		parse("invalid");

	}

}
