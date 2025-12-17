package assignments;

public class Assignment3_EmpGroups {
	
	public static void main(String[] args) {
		
		//Create the object of parentClass & Retrieve the data from the Employees class,
		Assignment3_Employees empObj = new Assignment3_Employees();
		
		//Create another class called EmpGroups that contains two arrays to store the employee names and IDs.
		String[] empNames = new String[3];
		short[] empIds = new short[3];
		
		//store it in these arrays
		empNames[0] = empObj.emp1Name;
		empNames[1] = empObj.emp2Name;
		empNames[2] = empObj.emp3Name;
		
		empIds[0] = empObj.emp1Id;
		empIds[1] = empObj.emp2Id;
		empIds[2] = empObj.emp3Id;
		
		//print each employee's name along with their corresponding ID.
		System.out.println("Employee Name: "+empNames[0]+" , "+"Employee ID: "+empIds[0]);
		System.out.println("Employee Name: "+empNames[1]+" , "+"Employee ID: "+empIds[1]);
		System.out.println("Employee Name: "+empNames[2]+" , "+"Employee ID: "+empIds[2]);


	}

}
