import java.util.Arrays;

// Establishes Variables
public class Student implements Comparable<Student>{
	public String givenName, familyName;
	public int year;
	public double[] grades;
	
// Allows Variables to be used by methods in StudentDirectory
	public Student(String givenName, String familyName, int year, double[] grades){
		this.givenName = givenName;
		this.familyName = familyName;
		this.year = year;
		this.grades = grades;
	}
	
	public String getGiven(){
		return this.givenName;
	}
	
	public String getFamily(){
		return this.familyName;
	}
	
	public double average(){
		if(grades == null)
			return -1.0;
		return (double)(Arrays.stream(grades).sum() / grades.length);
	}
	
	public String toString(){
		String padding = (this.year < 10) ? " " : "";
		return this.givenName + " " + this.familyName + "\n" +
				"Year: " + padding + this.year + "\t" + 
				"Average: " + String.format("%.2f",this.average());
	}
	
	public int compareTo(Student other){
		return this.familyName.toUpperCase().compareTo(other.getFamily().toUpperCase());
	}
}
