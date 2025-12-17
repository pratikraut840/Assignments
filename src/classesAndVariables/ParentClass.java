package classesAndVariables;

public class ParentClass {
	
	String empName = "Pratikk"; //instance variable (can be accessed by creating object) -- global scope
	int empId = 44; 
	static boolean visaStatus=true; //static variable (can be accessed without object creation, by taking className because it stores in heapMemory)

	public static void main(String[] args) {
		//Class is template or prototype that we are going to use to store data and methods together
		
		int age = 30; //local variable -- block scope
		
		ParentClass obj = new ParentClass(); //to access global/instance Variable
		
		System.out.println("Employee age "+age);
		System.out.println("Employee Name "+obj.empName);
		System.out.println("Employee id "+obj.empId);
		System.out.println("Employee visaStatus "+obj.visaStatus);
	}

}
