package temp;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class stringOps {

	public static void main(String[] args) {

		// store string in variable
		String value = " Username : Admin, Password : admin123 ";
		System.out.println(value);

		// get total characters
		int totalChar = value.length();
		System.out.println(totalChar);

		// get specific char from string
		char specific = value.charAt(12);
		System.out.println(specific);

		// reverse string
		String reverseStr = "";
		for (int i = value.length() - 1; i >= 0; i--) {

			reverseStr = reverseStr + value.charAt(i);
		}
		System.out.println(reverseStr);

		// remove unwanted space
		String removeSpace = value.trim();
		System.out.println(removeSpace);

		// remove all spaces
		String removeAllSpaces = value.replaceAll(" ", "");
		System.out.println("removeAllSpaces :" + removeAllSpaces);

		// remove all alphabets
		String removeAllAlphabets = value.replaceAll("[a-zA-Z]", "");
		System.out.println(removeAllAlphabets);

		// remove all numbers
		String removeAllNumbers = value.replaceAll("[0-9]", "");
		System.out.println(removeAllNumbers);

		// remove all specialChars
		String removeAllspecialChars = value.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(removeAllspecialChars);

		// convert string to uppercase
		String upperCase = value.toUpperCase();
		System.out.println(upperCase);

		// convert string to lowercase
		String lowercase = value.toLowerCase();
		System.out.println(lowercase);

		// extract username & pass
		String extractUser = value.substring(12, 17);
		String extractPass = value.substring(30, 38);
		System.out.println(extractUser);
		System.out.println(extractPass);

		// extract username & pass from dynamicString
		String[] extractDynamicUser = value.split(" ");
		String[] extractDynamicPass = value.split(" ");
		System.out.println(extractDynamicUser[3]);
		System.out.println(extractDynamicPass[6]);

		// compare two different string
		String str1 = "Admin";
		String str2 = "admin";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.startsWith("A"));
		System.out.println(str1.endsWith("n"));

		// verify empty string (No spaces) & blank (only spaces)
		String str3 = " ";
		System.out.println(str3.isEmpty());// No spaces
		System.out.println(str3.isBlank());// Only spaces

		// String vs StringBuffer vs StringBuilder
		// String is immutable
		// StringBuffer is immutable and thread safe (synchronized)
		// StringBuilder is immutable but not thread safe (non synchronized)

		// String immutable
		String fullName = "Pratik";
		fullName.concat("R");
		System.out.println(fullName); // doesn't modify original string

		// StringBuffer mutability
		StringBuffer buffer = new StringBuffer("Pratik");
		buffer.append("R");
		System.out.println(buffer);

		// StringBuilder mutability
		StringBuilder builder = new StringBuilder("Pratik");
		builder.append("R");
		System.out.println(builder);

		// convert other data types into string
		int std = 91;
		long phone = 77099;
		String stdCode = String.valueOf(std);
		String phoneCode = String.valueOf(phone);
		System.out.println(stdCode + phoneCode);

		// convert string data types into other using parseInt, parseDouble
		String accBal = "Account balance is : 900.31";
		String actualBal = accBal.replaceAll("[^0-9.]", "");
		double realBal = Double.parseDouble(actualBal);
		System.out.println(realBal);

		// convert date & time into string
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		String getDateTime = sdf.format(Calendar.getInstance().getTime());
		System.out.println(getDateTime);

		// type Conversion vs Type Casting
		// type conversion: converting one data type to another data type
		byte marks = 10;
		int studentMarks = marks;

		// type casting: converting one primitive data type into another
		int population = 15;
		byte cityPopulation = (byte) population;

	}

}
