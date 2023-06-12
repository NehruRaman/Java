package string;

import java.util.Objects;

public class Employee {
	private int empiId;
	private String empName;
	private int age;
	private long aadhar;

	
	public Employee(int empiId, String empName, int age, long aadhar) {
		super();
		this.empiId = empiId;
		this.empName = empName;
		this.age = age;
		this.aadhar = aadhar;
	}
	
	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpiId() {
		return empiId;
	}
	public void setEmpiId(int empiId) {
		this.empiId = empiId;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(aadhar, age, empName, empiId);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		return (aadhar) == (other.aadhar); /*&& age == other.age
				&& Objects.equals(empName, other.empName) && empiId == other.empiId;*/
		
	}
	
	@Override
	public String toString() {
		
		return "Employee empiId=" + empiId + ", empName=" + empName + ", age=" + age + ", aadhar=" + aadhar ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee na = new Employee(007,"kamal",25,473458929499l);
		Employee na1 = new Employee(0010,"mahi",28,473458929493l);
		Employee na2 = new Employee(0011,"kamal",25,473458929499l);
		Employee na3 = new Employee(0012,"vimal",27,473458929493l);
		Employee na4 = new Employee(0013,"suresh",25,473458929497l);
		Employee na5 = new Employee(0014,"surya",28,47345892947l);
		Employee na6 = new Employee(0015,"vijay",25,473458929499l);
		Employee na7 = new Employee(0016,"vimal",27,473458929493l);
		Employee na8 = new Employee(0012,"kamal",25,4734589294996l);
		Employee na9 = new Employee(0010,"mahi",28,473458929493l);
		Employee na10 = new Employee(002,"kamal",25,473458929499l);
		Employee na11 = new Employee(003,"vimal",27,473458929493l);
		
		
		System.out.println("\ndiplay toString method  to all propertie\n");
		System.out.println(na);
		System.out.println(na1);
		System.out.println(na2);
		System.out.println(na3);
		System.out.println(na4);
		System.out.println(na5);
		System.out.println(na6);
		System.out.println(na7);
		System.out.println(na8);
		System.out.println(na9);
		System.out.println(na10);
		System.out.println(na11);
		System.out.println("\nobject Equal or not using true or false\n");
		System.out.println(na.equals(na1));
		System.out.println(na1.equals(na3));
		System.out.println(na.equals(na2));
		System.out.println(na4.equals(na1));
		System.out.println(na4.equals(na5));
		System.out.println(na5.equals(na6));
		System.out.println(na6.equals(na7));
		System.out.println(na6.equals(na8));
		System.out.println(na6.equals(na10));
		System.out.println(na.equals(na11));
		System.out.println(na1.equals(na5));
		System.out.println(na2.equals(na7));
		
		

	}

}
