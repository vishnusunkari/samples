package vis.javaspecific.exception;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MainExceptionDemo {

	public static void main(String[] args) {
		SubExceptionDemo subExcDemo = new SubExceptionDemo();
		try {
			System.out.println(subExcDemo.getInt());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
