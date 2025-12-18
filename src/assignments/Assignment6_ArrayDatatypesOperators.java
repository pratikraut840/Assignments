package assignments;

public class Assignment6_ArrayDatatypesOperators {

	public static void main(String[] args) {
		// Array of Student Names
		String[] studentNames = new String[3];
		studentNames[0] = "Suresh";
		studentNames[1] = "Mahesh";
		studentNames[2] = "Naresh";
		
		// Array of Student Marks
		int[] studentMarks = new int[3];
		studentMarks[0] = 75;
		studentMarks[1] = 80;
		studentMarks[2] = 82;
		
		//Add 10 marks to each students using assignment operators
		int updatedStudent1Marks = studentMarks[0]+10;
		int updatedStudent2Marks = studentMarks[1]+10;
		int updatedStudent3Marks = studentMarks[2]+10;
		
		//store it into another array,
		int[] updatedMarks = new int[3];
		updatedMarks[0] = updatedStudent1Marks;
		updatedMarks[1] = updatedStudent2Marks;
		updatedMarks[2] = updatedStudent3Marks;
		
		System.out.println("Updated marks of "+studentNames[0]+ " :"+updatedMarks[0]);
		System.out.println("Updated marks of "+studentNames[1]+ " :"+updatedMarks[1]);
		System.out.println("Updated marks of "+studentNames[2]+ " :"+updatedMarks[2]);
		
//		/the average marks of all students
		int avegareMarks = (updatedMarks[0]+updatedMarks[1]+updatedMarks[2])/3;
		System.out.println("The average marks of all students :"+avegareMarks);

	}

}
