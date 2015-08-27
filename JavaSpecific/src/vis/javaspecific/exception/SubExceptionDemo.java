package vis.javaspecific.exception;
import java.io.FileNotFoundException;
import java.io.IOException;


public class SubExceptionDemo extends SuperExceptionDemo {

	public int getInt() throws FileNotFoundException {
		return 2;
	}
}
