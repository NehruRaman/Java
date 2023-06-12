package string;

import java.util.Objects;

public class Student {
	
	 // Member attributes of this class
	private String stuName;
	private int rollno;
	private String dep;
	private final static String collegeName = "Tirukoilur College Of Arts and Science";
	
	 // Method of this class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an object of this class
        // Custom attributes been passed as in arguments
		Student na = new Student("Nehru",007,"BCA");
		System.out.println("student Details is :");
		  // toString() method as both will print the same
        // Print the object
		System.out.println("Student number 1:\n"+na);
		
		 // Creating an another object of this class
        // Custom attributes been passed as in arguments
		Student na1 = new Student("Mahi",006,"BCA");
		
		  // Print the object but implicitly using toString()
        // method
		System.out.println("Student number 2:\n"+na1);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dep, rollno, stuName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dep, other.dep) && rollno == other.rollno && Objects.equals(stuName, other.stuName);
	}

	// Constructor of this class
	// Constructor to initialize a Student
	public Student(String stuName,int rollno,String dep)
	{
		// This variable refers to current instance itself
		this.stuName = stuName;
		this.rollno = rollno;
		this.dep = dep;
		
	}
	 // Getters
	public String getName() {
		return this.stuName;
	}
	public int getRllNo() {
		return this.rollno;
	}
	public String getdept() {
		return this.dep;
	}
	 // Setters
	public void setName(String stuName) {
		this.stuName = stuName;
	}
	public void setRllNo(int rollno) {
		this.rollno = rollno;
	}
	public void setdept(String dep) {
		this.dep = dep;
	}
	// Overriding toString() method of object class
public String toString()
{
	return "student Name:\n"+this.stuName+"\nStudent RollNo:\n"+rollno+"\nStudent Department\n"+dep+"\nColllege Name:\n"+collegeName+"\n";
}
}