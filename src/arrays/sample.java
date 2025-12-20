package arrays;

public class sample {

	public static void main(String[] args) {
		// 1D
//		When we know the values:
		int[] num = { 1, 2, 3 };
		System.out.println(num[1]);
//		When we dont know the values:
		int[] num2 = new int[2];
		num2[0] = 2;
		num2[1] = 4;
		System.out.println(num2[1]);

//			--------------------------------------

		// 2D
//			WHen we know the values                 
		String[][] empNames = { // 2 company and 3 employee has each employee
				{ "OM", "kom", "som" }, // company1
				{ "NOM", "DOM", "LOM" } // company2
		};
		System.out.println(empNames[0][2]);

//			When we dont know the values
		String[][] empNames2 = new String[2][3];
		empNames2[0][0] = "Lord";
		empNames2[1][2] = "Shivaji";
		System.out.println(empNames2[1][2]);

		// 3D
//			When we know values
		String[][][] employee4 = // 2 project has 3 company and each 3 company has 4 employees
				{ { // project1
						{ "ram", "shyam", "gyan", "1" }, // 3 employess of comp1
						{ "OM", "SHIV", "SHAKTII", "2" }, // 3 employess of comp2
						{ "POM", "KOM", "ROM", "3" } // 3 employess of comp3
				}, { // project2
						{ "I", "ME", "YOU", "4" }, // 3 employess of comp1
						{ "WE", "HE", "SHE", "5" }, // 3 employess of comp2
						{ "IT", "THEY", "SO", "6" } // 3 employess of comp3
				} };
		System.out.println(employee4[1][2][3]);

		// 3D
//			When we dont know the values
		String[][][] emp5 = new String[2][3][4];
		emp5[1][2][3] = "K2";
		System.out.println(emp5[1][2][3]);

	}
}