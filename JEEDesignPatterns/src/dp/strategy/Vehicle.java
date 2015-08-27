package dp.strategy;

public abstract class Vehicle {

	private Go goAlg;
	
	public Vehicle(){
		
	}
	
	public void setGo(Go go){
		this.goAlg = go;
	}
	
	public void go(){
		goAlg.go();
	}
}
