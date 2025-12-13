package assignments;

public class Assignment2_MultiDimensionalArray {

	public static void main(String[] args) {
		/***
	  	1. Create a 3D array to represent the following data:
				o Semesters as the first dimension.
				o Subjects and Status/Marks as the second dimension.
				o Actual values for Subject Names and Marks as the third dimension.
		2. From the array:
			o Print Semester 2 Subject 4 and Subject 5 names.
			o Print the Status/Marks of Semester 4 Subject 3 and Subject 6. ***/
		
		//Approach1: When we know the values
		String[][][] MultiDimArray = 
			{ // 6 SEM has 6 subject & each subject has status/marks
				{ //Sem1
					{"Mathematics 1","Pass(78)"}, //status/marks of sub1
					{"Physics","Pass(85)"}, //status/marks of sub2
					{"Chemistry","Fail(21)"}, //status/marks of sub3
					{"Computer Programming","Pass(74)"}, //status/marks of sub4
					{"Engineering Drawing","Pass(88)"}, //status/marks of sub5
					{"Basic Electrica Engg","Pass(79)"}  //status/marks of sub6
				},
				{ //sem2
					{"Mathematics 2","Pass(82)"},
					{"Mechanics","Pass(77)"},
					{"Environment Sci","Pass(93)"},
					{"Basic Electronics","Fail(19)"},
					{"Engineering Physics","Fail(24)"},
					{"Engineering Graphics","Pass(90)"}
				}, 
				{//sem3
					{"Data Structures","Pass(88)"},
					{"Discete Mathematics","Pass(81)"},
					{"Digital Electronics","Pass(76)"},
					{"Operating System","Fail(19)"},
					{"Signals and Systems","Pass(85)"},
					{"Object oriented prog","Pass(78)"}
				}, 
				{//sem4
					{"Algorithm","Pass(91)"},
					{"Computer Networks","Pass(73)"},
					{"Database Systems","Fail(19)"},
					{"Microprocessors","Pass(80)"},
					{"Communication Engg","Pass(76)"},
					{"Software Enginnering","Pass(87)"}
				}, 
				{//sem5
					{"Probablity & Stat","Pass(86)"},
					{"Machine Learning","Pass(88)"},
					{"Compiler Design","Pass(84)"},
					{"Theory of computation","Pass(95)"},
					{"Embedded System","Pass(73)"},
					{"Computer Graphics","Pass(90)"}
				}, 
		
		};
		//Semester 2 Subject 5 names
		System.out.println("Print Semester 2 Subject 4 names and Subject 5 names==>"+MultiDimArray[1][3][0]+" & "+MultiDimArray[1][4][0]);
	
		//Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Print the Status/Marks of Semester 4 Subject 3 and Subject 6 ==>"+MultiDimArray[3][2][1]+" & "+MultiDimArray[3][5][1]);
	}
}
