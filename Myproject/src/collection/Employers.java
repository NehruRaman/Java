package collection;

import java.util.Arrays;

public class Employers implements Comparable<Employers> {

		 String name;
		 int age;
		 int salary;
		 int expriance;

		 public String getName() {
		  return name;
		 }

		 public void setName(String name) {
		  this.name = name;
		 }

		 public int getAge() {
		  return age;
		 }

		 public void setAge(int age) {
		  this.age = age;
		 }

		 public int getSalary() {
		  return salary;
		 }

		 public void setSalary(int salary) {
		  this.salary = salary;
		 }

		 public int getExpriance() {
		  return expriance;
		 }

		 public void setExpriance(int expriance) {
		  this.expriance = expriance;
		 }

		 @Override
		 public String toString() {
		  return "Employers [name=" + name + ", age=" + age + ", salary=" + salary + ", expriance=" + expriance + "]";
		 }

		 public Employers(String name, int age, int salary, int expriance) {
		 
		  this.name = name;
		  this.age = age;
		  this.salary = salary;
		  this.expriance = expriance;
		 }

		 public static void main(String[] args) {

		  Employers obj = new Employers("purushoth", 24, 20000, 4);

		  Employers obj1 = new Employers("arun", 25, 50000, 4);

		  Employers obj3 = new Employers("rayapan", 23, 20000, 5);

		  
		   
		  Employers arr[] = { obj, obj1, obj3 };
		  
		    Arrays.sort(arr);
		  
		  for (Employers s : arr) {
		   
		   System.out.println(s);
		   
		  }
	}

		
		@Override
		public int compareTo(Employers o) {
			// TODO Auto-generated method stub
			 return this.getName().compareTo(o.getName());
		}

}
