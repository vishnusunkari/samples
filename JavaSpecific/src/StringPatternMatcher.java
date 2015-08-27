import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringPatternMatcher {

	public static void main(String[] args) {
		
		Pattern pattern  = Pattern.compile("1\\d00\\d101");
		String str = "110011011000010110001101";
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
