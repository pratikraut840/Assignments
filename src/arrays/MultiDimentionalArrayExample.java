package arrays;

public class MultiDimentionalArrayExample {
	
	//Array: Array can store multiple values of similar data types

	public static void main(String[] args) {
		
		//2D Array: Array of multiple 1D Arrays
		// There are 2 projects in a company and each project has 3 employees
		
		String[][] company = {
								{"Bob","Marle","Merry"}, //Project1 Employees
								{"Sonam", "Mohan","Shakti"} //Project1 Employees
								};

		//2D array creation when we dont know values
		String[][] company2 = new String[2][3]; //2 projects in a company and each project has 3 employees
		company2[0][0] = "Niket";
		company2[0][2] = "Sanket";
		
		company2[1][0] = "Jazz";
		company2[1][2] = "Sam";
		
		//Accessing the values from 2D array
		System.out.println("Employees from project1 :"+company2[0][2]);
		System.out.println("Employees from project1 :"+company2[1][2]);
		
		//3D Array: Array of multiple 3D Array
		String[][][] bigCompany = {
				{ 	//company1
					{"Jane","Jojn"},	 //project1 employees in company1
					{"Meery","Kom"} 	//project2 employees in company1
				},
				{	//company2
					{"Radhe","Shyam"}, 	//project2 employees in company2
					{"Hari","OM"} 	//project2 employees in company2
				}
		};
		
		//Accessing the values from 3D array
		System.out.println("Employees from company1 :"+bigCompany[0][0][0]);
		System.out.println("Employees from company2 :"+bigCompany[1][1][1]);
				
		//When we dont know the values
		String[][][] bigCompany2 = new String[2][2][2];
		bigCompany2[0][0][0] = "Sirra";
		bigCompany2[1][1][1] = "Kiara";
		
		//Accessing the values from 3D array
		System.out.println("Employees from company1 :"+bigCompany2[0][0][0]);
		System.out.println("Employees from company2 :"+bigCompany2[1][1][1]);
		
		
		
				
	}

}
