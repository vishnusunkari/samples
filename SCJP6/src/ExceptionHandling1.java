
public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			submethod();
		} catch (SubException e) {
			System.out.println("SubException caught in the main mehtod");
		}
	}

	public static void submethod() throws SubException {
		try{
			test();			
		} catch (SubException se) {
			throw se;
		}
		catch (Exception ex){
			System.out.print("exception");			
		}
		System.out.print("end");

	}
	
	static void test() throws Exception {
		throw new SubException();
	}
	

}
