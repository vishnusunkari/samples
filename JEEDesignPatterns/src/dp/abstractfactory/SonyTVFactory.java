package dp.abstractfactory;

public class SonyTVFactory implements TVFactory {

	@Override
	public TV createTV() {
		return new HighDefTV() ;
	}

}
