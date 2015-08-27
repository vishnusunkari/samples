package dp.flyweight;

public class Student {
	String name;
	int id;
	int score;
	double avgScore;
	
	public Student(double a){
		avgScore = a;
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
		return (((double) score)/avgScore-1.0)*100.0;
	}


	
}
