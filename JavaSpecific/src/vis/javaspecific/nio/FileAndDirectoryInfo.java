package vis.javaspecific.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException {
		Path currentRelativePath = Paths.get("");
		System.out.println("Present working directory : " + currentRelativePath.toAbsolutePath());
		System.out.println("Enter the path :  ");
		Scanner input = new Scanner(System.in);
		Path path = Paths.get(input.nextLine());
		System.out.println(Files.exists(path));
		if (Files.exists(path)) {
			System.out.println("File or Directory name : "
					+ path.getFileName()
					+ (Files.isDirectory(path) ? " is Directory "
							: " is Not a Directory"));
			System.out.println(path.toString()
					+ " is " 
					+ (path.isAbsolute() ? " an absolute path "
							: " not an absolute path."));
			System.out.println("Last modified time : " + Files.getLastModifiedTime(path));
			System.out.println("Size  : " + Files.size(path) + " bytes ");
			System.out.println("Path : " + path.toString());
			System.out.println("Absolute Path : " + path.toAbsolutePath());
			if(Files.isDirectory(path)) {
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(path);
				for(Path p : dirStream) {
					System.out.println(p);
				}
			}
			
		}
	}

}
