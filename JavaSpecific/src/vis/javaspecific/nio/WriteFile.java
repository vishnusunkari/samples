package vis.javaspecific.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		File file = new File("test.txt");
		try {
			PrintWriter pr = new PrintWriter(file);
			pr.println("Mike Fudge");
			pr.println(42);
			pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner input;
		try {
			input = new Scanner(file);
		
		String name = input.nextLine();		
		int age = input.nextInt();
		System.out.println(name + " :  " + age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file2 = new File("students.txt");
		FileOutputStream fo = new FileOutputStream(file2);
		ObjectOutputStream output2 = new ObjectOutputStream(fo);
		for (Student s : students) {
			output2.writeObject(s);
		}
		output2.close();
		fo.close();

	}

}
