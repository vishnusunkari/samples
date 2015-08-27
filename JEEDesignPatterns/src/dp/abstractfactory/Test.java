package dp.abstractfactory;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TVFactory tvFactory = createTVFactory();
		TV tv= tvFactory.createTV();
		tv.broadcastTechnology();
		
/*		List<TV> tvList = new ArrayList();
		for(int i=0;i<10;i++){
			tvList.add(tvFactory.createTV());
		}
		ListIterator itr = (ListIterator) tvList.iterator();
		while(itr.hasNext()){
			(TV) itr.next()
		}*/

	}
	
	public static TVFactory createTVFactory(){
		int i = (int) (Math.random()*10);
		System.out.println("i = "+i);
		if(i%2 == 0){
			return new SonyTVFactory();
		} else { 
			return new SamsungTVFactory();
		}
	}
	

}
