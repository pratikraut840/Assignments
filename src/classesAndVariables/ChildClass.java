package classesAndVariables;

public class ChildClass extends ParentClass { //child extends parent

	public static void main(String[] args) {
		
//		ClassesInJava obj3 = new ClassesInJava(); //object of parent class
		ParentClass obj2 = new ChildClass(); //object of child class
		
		// We can call all parentClass static data without object creation
		// We can call all parentClass non-static data only by using object creation
		System.out.println("Employee Name "+obj2.empName);
		System.out.println("Employee Id "+obj2.empId);
		System.out.println("Employee visaStatus "+visaStatus);

	}

}
