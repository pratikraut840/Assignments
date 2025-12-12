package arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		
		//Array: Collection of similar data types
		
		/****** Create array when we know the values ******/
		
		//Store 3 employee names in array
		String[] empNames = {"Raj", "OM", "Ketan"};
		
		//Store 3 employee ids in array
		int[] empIds = {1,2,3};
		
		System.out.println("Employee names from employee array :"+empNames[1]);
		System.out.println("Employee names from employee array :"+empIds[1]);
		
		
		/*** Create array when we dont know the values ***/
		
		//Store 3 employee names in array
		String[] empNames2 = new String[3];
		empNames2[0] = "Rahul";
		empNames2[1] = "Ajay";
		empNames2[2] = "Niket";
		
		//Store 3 employee ids in array
		int[] empIds2 = new int[3];
		empIds2[0] = 11;
		empIds2[1] = 12;
		empIds2[2] = 13;
		
		System.out.println("Employee names from employee2 array :"+empNames2[1]);
		System.out.println("Employee names from employee2 array :"+empIds2[1]);
		
		/*** ArrayIndexOutOfBoundException ***/
		
		String[] company = new String[2];
		company[2] = "Impetus";
//		company[3] = "Cognizant"; // This will throw ArrayIndexOutOfBoundsException

	}

}
