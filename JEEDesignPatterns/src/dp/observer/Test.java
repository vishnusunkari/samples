package dp.observer;

public class Test {

	public static void main(String[] args) {
		//Subject
		SubjectDatabase subjectDatabase = new SubjectDatabase();
		
		//Observers
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();
		
		//Observers registering with the Subject 		
		subjectDatabase.registerObserver(archiver);
		subjectDatabase.registerObserver(client);
		subjectDatabase.registerObserver(boss);
		
		//Action on Subject notifies all the registered Observers 
		subjectDatabase.editRecord("delete", "record 1");

	}

}
