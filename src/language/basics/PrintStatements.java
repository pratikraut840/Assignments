package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Print the information and go to next line.
		System.out.println("Hellow World");
		
		/** System is a class.
		 *  out is standard output stream, usually the console
		 *  println => Prints a String and then terminates the line.
		 */
		
		//Print the information and stay on same line.
		System.out.print("Hellow");
		System.out.print("World");
		System.out.println();
		
		//Print the normal content and stay on same line.
		System.out.println("Deepika is completed B.TECH and employee ID is 1234 and visa status is true");
		System.out.println("Lakshmi is completed B.COM and employee ID is 1122 and visa status is false");
		System.out.println("Prabhu is completed M.TECH and employee ID is 4455 and visa status is true");
		
		// %s = String
		// %d = digit
		// %b = boolean
		// %f = float value with decimal
		
		//Print the dynamic and formatted content and stay on same line.
		System.out.printf("%s is completed M.TECH and employee ID is %d and visa status is %b", "Rahul", 4545, false);	
		System.out.printf("%s is completed M.TECH and employee ID is %d and visa status is %b", "Raj", 6696, true);	
		System.out.printf("%s is completed M.TECH and employee ID is %d and visa status is %b", "Ketan", 7878, false);
		System.out.println();
		
		double price = 755.4545;
		System.out.printf("Price is : "+price);
		System.out.println();
		
		//Print the error message.
		System.err.println("Hey man, There is an error on the line no 41. Please check");
		System.out.println();
		
		//Print a multi-line message.
		System.out.println("""
				My name is Pratik.
				My qualification is BE.
				My role is QA
				""");
		System.out.println();
		
		//Print the logs during execution process to monitor and understand the outcome of each and every line and every stage
		//Purpose = Printing and monitoring the output
		
		Logger log = Logger.getLogger("Hello World program logs"); //Logger is a class and getLogger() is method
		log.info("Hey man, Right now we have completed the 57 line completely. Congratulations");
		System.out.println();
		
		log.warning("Hey man, We have completed the 60 line but unfortunately there is an issue. Please check");
		System.out.println();
		
		//Print and export the log messages into text file
		PrintWriter logger = new PrintWriter("C:\\AutomationTraining\\JavaTraining\\Logs.txt");
		logger.println("Hello user. Currently line number 68 is successfully completed.");
		logger.println("Hello user. Currently line number 69 is successfully completed.");
		logger.close();
		
	}

}
