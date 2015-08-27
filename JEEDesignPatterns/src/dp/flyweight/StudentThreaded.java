package dp.flyweight;

public class StudentThreaded {

	String name;
	int id;
	int score;
	double avgScore;
	private static StudentThreaded singleObject = new StudentThreaded();
	
	private StudentThreaded(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	public double getStanding(){
		return (((double) score)/avgScore-1.0)*100;
	}
	
	public static StudentThreaded getInstance(){
		return singleObject;
	}
}
