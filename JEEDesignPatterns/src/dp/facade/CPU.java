package dp.facade;

/*Complex parts */
public class CPU {

	public void freeze(){
		System.out.println("Performing CPU freeze operation");
	}
	
	public void jump(long position) {
		System.out.println("Jumping to position " + position);
	}
	
	public void execute(){
		System.out.println("Executing instructions");
	}
}
