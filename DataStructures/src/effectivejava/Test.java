package effectivejava;

public class Test {

	public static void main(String[] args) {
		
		Ensemble ensembleObj = Ensemble.NONET;
		Ensemble ensembleObj2 = Ensemble.SEXTET;
		System.out.println("ensembleObj.name() : " + ensembleObj.name());
		System.out.println("ensembleObj.ordinal() : " + ensembleObj.ordinal());
		System.out.println("ensembleObj.SEXTET.ordinal() : " + ensembleObj.SEXTET.ordinal());
		System.out.println("ensembleObj2.ordinal() : " + ensembleObj2.ordinal());

		System.out.println("ensembleObj.numberOfMusicians() : " + ensembleObj.numberOfMusicians());
		

	}

}
  