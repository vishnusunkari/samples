package prog.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebsite {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com");
			InputStream ins = url.openStream();
			InputStreamReader isr = new InputStreamReader(ins);
			BufferedReader bfr = new BufferedReader(isr);
			String line;
			while((line=bfr.readLine())!=null){
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
