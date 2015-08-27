package dp.flyweight;

public class TestStudentThreaded implements Runnable {

	
	public TestStudentThreaded(){
		String names[] = {"Ralph", "Alice", "Sam"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};
		
		double total =0;
		for(int i=0;i<scores.length;i++){
			total+=scores[i];
		}
		double avgScore = total/scores.length;
		StudentThreaded student = StudentThreaded.getInstance();
		student.setAvgScore(avgScore);
		student.setName("Ralph");
		student.setId(1002);
		student.setScore(45);
		
	}
	

	public static void main(String[] args) {
		TestStudentThreaded t1 = new TestStudentThreaded();
		TestStudentThreaded t2 = new TestStudentThreaded();
		Thread thread1 = new Thread(t1);
		thread1.start();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
	
	@Override
	public void run() {
		StudentThreaded student =StudentThreaded.getInstance();
		System.out.println("Object: " + student + ", Name: " + student.getName() + ", Standing: " + Math.round(student.getStanding()));
	}



}
