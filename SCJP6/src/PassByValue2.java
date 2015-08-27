
public class PassByValue2 {
	private PassByValue xyz;
	
	PassByValue getPassByValue(){
		xyz = new PassByValue(); 
		//System.out.println("xyz = " + xyz);
		return xyz;
	}
}
