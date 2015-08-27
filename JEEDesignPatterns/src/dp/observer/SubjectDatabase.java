package dp.observer;

import java.util.Vector;

public class SubjectDatabase implements Subject{

	private Vector <Observer> observers;
	private String operation;
	private String record;
	
	public SubjectDatabase(){
		observers = new Vector<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers){
			observer.update(operation, record);
		}		
	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}

}
