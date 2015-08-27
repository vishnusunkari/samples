import java.text.NumberFormat;


public class CurrencyFormat {

	public static void main(String[] args) {
		double d = 72.136987876978;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(d));

	}

}
