import java.util.Scanner;

public class ScannerDemo_1 {
  public static void main(String args[]) {
    //Scanner sc = new Scanner("Name: Tom Age: 28 ID: 77 Address: Columbus");
	  Scanner sc = new Scanner("hi 5 bye 6 takecare 7");
	  sc.useDelimiter("\\d");
	  System.out.println("sc.nextInt is : " + sc.nextInt());
    //System.out.println("Output: " + sc.findWithinHorizon("ID:",30));

 //   if (sc.hasNext())
  //    System.out.println(sc.next());
   // else
    //  System.out.println("Error!");
  }
}