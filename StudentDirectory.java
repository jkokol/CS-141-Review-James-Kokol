import java.io.*;
import java.util.*;

public class StudentDirectory{
	
// Access to the students.txt file and setup for the Scanner and Array
	public static void main(String[]args) throws FileNotFoundException{ 
		File file  = new File("students.txt");
		Scanner scan = new Scanner(file);
		Student[] directory = buildDirectory(scan);
		Arrays.sort(directory);
		printDirectry(directory);
	}
// Scanner for the Data in Students.txt
	public static Student[] buildDirectory(Scanner scan){
		int len = scan.nextInt();
		Student[] directory = new Student[len];
		for(int i = 0; i < len; i++){
			String givenName = scan.next();
			String familyName = scan.next();
			int year = scan.nextInt();
			String[] temp = scan.nextLine().trim().split(" ");
			double[] grades = new double[temp.length];
			for(int j = 0; j < temp.length; j++){
				grades[j] = Integer.parseInt(temp[j]);
			}
			directory[i] = new Student(givenName, familyName, year, grades);
		}
		return directory;
	}
// Displays the organized data in the console	
	public static void printDirectry(Student[] directory){
		for(int i = 0; i < directory.length; i++){
			System.out.println(directory[i].toString()+"\n");
		}
	}
}
