import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FileProcessor {
	public static void main(String[] args) {
		
		File inputFileOne = new File("InputFile_20150820.txt");
		PrintWriter pr1=null, pr2=null, pr3=null;
		Set<CustomerPrice> setOne = new HashSet<CustomerPrice>(15);
		Set<CustomerPrice> setTwo = new HashSet<CustomerPrice>(15);
		Set<CustomerPrice> setThree = new HashSet<CustomerPrice>(15);
		Scanner scannerOne= null;
		Scanner scannerTwo = null;
		try {
			pr1=new PrintWriter(new File("file1"));
			pr2=new PrintWriter(new File("file2"));
			pr3=new PrintWriter(new File("file3"));
			scannerOne = new Scanner(inputFileOne);
			
			//Start Processing of First File
			if(!scannerOne.hasNextLine()) {
				System.exit(1);
			} else {
				//Remove the heading
				scannerOne.nextLine();
				int i=1;
				while(scannerOne.hasNextLine()) {
					CustomerPrice cs = tokenizeToCs(scannerOne.nextLine());
					if(i%3==1) {
						setOne.add(cs);
						writeToFile(cs, pr1);
					} else if(i%3==2) {
						setTwo.add(cs);
						writeToFile(cs, pr2);
					} else if(i%3==0) {
						setThree.add(cs);
						writeToFile(cs, pr3);
					}					
					i++;
					System.out.println(cs.toString());
				}
			}
			//End Processing of First File
			
			
			//Start Processing of Second file
			File inputFileTwo = new File("InputFile_20150821.txt");
			scannerTwo = new Scanner(inputFileTwo);			
			if(!scannerTwo.hasNextLine()) {
				System.exit(1);
			} else {
				//Remove the heading
				scannerTwo.nextLine();
				while(scannerTwo.hasNextLine()) {
					CustomerPrice cs = tokenizeToCs(scannerTwo.nextLine());
					if(setOne.contains(cs)){
						writeToFile(cs, pr1);
					} else if (setTwo.contains(cs)) {
						writeToFile(cs, pr2);
					} else if (setThree.contains(cs)) {
						writeToFile(cs, pr3);
					} else {
						writeToFile(cs, pr1);
					}
				}
			}			
			
		} catch (FileNotFoundException fne) {
			System.out.println("Given File Not Found");
			fne.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException ");
			e.printStackTrace();
		} finally {
			pr1.close();
			pr2.close();
			pr3.close();	
			scannerOne.close();
			scannerTwo.close();
		}
		//End Processing Second file
	}

	private static void writeToFile(CustomerPrice cs, PrintWriter pr) {
		pr.write(cs.toString()+ "\n");		
	}

	private static CustomerPrice tokenizeToCs(String nextLine) {		
		String[] tokens = nextLine.split(",");
		if(tokens.length == 6) {
			return new CustomerPrice(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);			
		}
		return new CustomerPrice();
	}
}
