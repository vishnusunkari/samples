package dp.enumsingleton;

public enum Database {

	INSTANCE;
	
	private int record;
	private String name;
	private static final  Car car1 = new Car("Maruti", "800");
	
	public String getName(){
		return INSTANCE.name;
	}
	
	public int getRecord(){
		return INSTANCE.record;
	}
	
	public void setName(String n){
		name = n;
	}

	public Car getCar() {		
		return car1;
	}
	
}
