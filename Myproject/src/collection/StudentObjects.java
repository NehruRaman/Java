package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class StudentObjects {
	private long stu_Reg_No;
	private String stu_Name;
	private int totalmarks;

	
	public StudentObjects(long stu_Reg_No, String stu_Name, int totalmarks) {
		super();
		this.stu_Reg_No = stu_Reg_No;
		this.stu_Name = stu_Name;
		this.totalmarks = totalmarks;
	}

	public long getStu_Reg_No() {
		return stu_Reg_No;
	}

	public void setStu_Reg_No(long stu_Reg_No) {
		this.stu_Reg_No = stu_Reg_No;
	}

	public String getStu_Name() {
		return stu_Name;
	}

	public void setStu_Name(String stu_Name) {
		this.stu_Name = stu_Name;
	}
	

	

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	

	@Override
	public String toString() {
		return "StudentObjects [stu_Reg_No=" + stu_Reg_No + ", stu_Name=" + stu_Name + ", totalmarks=" + totalmarks
				+ "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(stu_Name, stu_Reg_No, totalmarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentObjects other = (StudentObjects) obj;
		return Objects.equals(stu_Name, other.stu_Name) && stu_Reg_No == other.stu_Reg_No
				&& totalmarks == other.totalmarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentObjects obj1 = new StudentObjects(12345,"Nehru",890);
		
		StudentObjects obj2 = new StudentObjects(12346,"Archana",1056);
		
		StudentObjects obj3 = new StudentObjects(12347,"Tamil",959);
		
		StudentObjects obj4 = new StudentObjects(12348,"mahi",1013);
		
		StudentObjects obj5 = new StudentObjects(12349,"Chandru",754);
		StudentObjects obj6 = new StudentObjects(12350,"Guru",950);

		ArrayList<StudentObjects> student = new ArrayList<StudentObjects>();
		student.add(obj1);
		student.add(obj2);
		student.add(obj3);
		student.add(obj4);
		student.add(obj5);
		student.add(obj6);
        for(StudentObjects a :student)
        {
        	System.out.println(a);
        	
        }
        Scanner na = new Scanner(System.in);
        Comparator<StudentObjects> compare = null;
        System.out.println("*******************************************************************");
        System.out.println("which student based sort you choose the is blow optin");
        System.out.println("option : 1  StudentNumber");
        System.out.println("option : 2  StudentName");
        System.out.println("option : 3  Studentmark");
        System.out.println("*******************************************************************");
        System.out.println(" you choose the is ablow optin");
      
        int option = na.nextInt();
        switch(option)
        {
		        case 1:  compare = (o1,o2) ->
		        {
		        	StudentObjects na1 = (StudentObjects)o1;
		        	StudentObjects na2 = (StudentObjects)o2;
		        	if(na1.stu_Reg_No>na2.stu_Reg_No)
		        	{
					return 1;
		        	}
		        	else if(na1.stu_Reg_No<na2.stu_Reg_No)
		        	{
					return 1;
		        	}
		        	else
		        	{
		        		return 0;
		        	}
		        };
		        break;
		        
		        case 2:  compare = (o1,o2) ->
		        {
		        	StudentObjects na1 = (StudentObjects)o1;
		        	StudentObjects na2 = (StudentObjects)o2;
		        	
		        	return na1.getStu_Name().compareTo(na2.getStu_Name());
		        };
		        break;
		        case 3:  compare = (o1,o2) ->
		        {
		        	StudentObjects na1 = (StudentObjects)o1;
		        	StudentObjects na2 = (StudentObjects)o2;
		        	if(na1.stu_Reg_No>na2.stu_Reg_No)
		        	{
					return 1;
		        	}
		        	else if(na1.stu_Reg_No>na2.stu_Reg_No)
		        	{
					return 1;
		        	}
		        	else
		        	{
		        		return 0;
		        	}
		        };
		        break;
        }
        Collections.sort(student,compare );
        for(StudentObjects a :student)
        {
        	System.out.println(a);
        	
        }
        }
	}

	

