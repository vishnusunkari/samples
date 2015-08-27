package dp.abstractfactory;

public class SamsungTVFactory implements TVFactory {

	@Override
	public TV createTV() {
		return new StandardDefTV();
	}

}
