package classesAndVariables;

public class NewClass {

	public static void main(String[] args) {
		// Object is bluePrint/New instance of class (Duplicate copy of class)
		
		ParentClass obj = new ParentClass();
		
		System.out.println("Employee Name "+obj.empName);
		System.out.println("Employee Id "+	obj.empId);
		System.out.println("Employee visaStatus "+	obj.visaStatus);
//		System.out.println("Employee age "+	obj.age); //cannot access because it is in block scope
		System.out.println("Employee visaStatus "+	ParentClass.visaStatus);
		

	}

}
