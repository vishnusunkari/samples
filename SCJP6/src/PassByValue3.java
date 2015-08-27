
public class PassByValue3 {
	public static void main(String [] args){
		PassByValue2 passByValue2 = new PassByValue2();
		System.out.println("break-1");
		PassByValue i = passByValue2.getPassByValue();
		System.out.println("break-2");
		System.out.println("passByValue2.getPassByValue() = "+ passByValue2.getPassByValue());
		System.out.println("break-3");
		System.out.println("i = "+ i);
		
	}
}
