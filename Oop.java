package learning;

public class Oop {
String Fname = "Priyanka";
String Lname = "Salvi";
final int age = 23; //The final keyword is useful when you want a variable to always store the same value
String Dept = "EXTC";
int salary = 35000;
	public static void main(String[] args) {
	
Oop employee1 = new Oop();//create object
System.out.println("First name of employee: " + employee1.Fname);
System.out.println("Last name of employee: " + employee1.Lname);
System.out.println("Age of employee: " + employee1.age);
System.out.println("Salary of employee: " + employee1.salary);

Oop employee2 = new Oop();//creating new object
employee2.Fname = "Mohini";// override existing values
employee2.Lname = "Chavan";// override existing values
employee2.Dept = "IT";// override existing values
employee2.salary = 35000;

System.out.println("First name of employee: " + employee2.Fname);
System.out.println("Last name of employee: " + employee2.Lname);
System.out.println("Age of employee: " + employee2.age);
System.out.println("Salary of employee: " + employee2.salary);
	}

}
