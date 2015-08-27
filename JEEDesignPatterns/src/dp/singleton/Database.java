package dp.singleton;

/*
 * Singleton Approach2
 * A privileged client can invoke the private constructor reflectively
 * (Item 53) with the aid of the AccessibleObject.setAccessible method. If you
 * need to defend against this attack, modify the constructor to make it throw an
 * exception if it’s asked to create a second instance.
 */

public class Database { 

//implements Cloneable{

   /*
	*  Step 1: Declare the Singleton Object as private static 
	*/
	private static Database singleObject;
	private int record;
	private String name;
	
	/*
	 *Step 1: Provide a default Private constructor
	 */
	private Database(String n){
		name = n;
		record = 0;
	}
	
	/*
	 * Step 1: Declare the Singleton Object as private static and 
	 *         Create a public static method for getting the reference to the Singleton Object
	 * Step 3: Make the Access method Synchronized to prevent Thread Problems.
	 */
	public static synchronized Database getInstance(String n){
		if(singleObject == null){
			singleObject = new Database(n); 
		}
		return singleObject;
	}
	
/*	public Database getInstance2(String n){
		if(singleObject == null){
			singleObject = new Database(n); 
		}
		return singleObject;
	}*/
	
    /*public Object clone()
    {
        try{
            return super.clone();
        }catch( CloneNotSupportedException e ){
            return null;
        }
    } 
	*/
	
	//Step 4: Override the Object clone method to prevent cloning
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public String getName() {
		return name;
	}
}
