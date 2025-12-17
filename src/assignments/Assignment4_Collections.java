package assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		/********* STUDENTS DETAILS *****/
		
		//Store Student1 Details using HashMap
		Map<String, String> student1Details = new HashMap<String,String>();
		student1Details.put("Name", "John Doe");
		student1Details.put("Age", "Twenty");
		student1Details.put("Gender", "Male");
		student1Details.put("Roll Number", "SBA12345");
		student1Details.put("Grade", "A++");
		student1Details.put("Major", "Computer Science");
		student1Details.put("GPA", "A3.8");
		student1Details.put("Email", "john@exam.com");
		student1Details.put("PAN Number", "SDF654321");
		student1Details.put("GPA", "123 Elm St");
		System.out.println("Student1 Details :"+student1Details);
		
		//Store Student2 Details using HashMap
		Map<String, String> student2Details = new HashMap<String,String>();
        student2Details.put("Name", "Jane Smith");
        student2Details.put("Age", "Twenty One");
        student2Details.put("Gender", "Female");
        student2Details.put("Roll Number", "SBA12346");
        student2Details.put("Grade", "B+");
        student2Details.put("Major", "Mathematics");
        student2Details.put("GPA", "A3.5");
        student2Details.put("Email", "jane@example.com");
        student2Details.put("PAN Number", "REW6543211");
        student2Details.put("Address", "456 Oak St");
		student2Details.put("GPA", "123 Elm St");
		System.out.println("Student2 Details :"+student2Details);
		
		//Store Student3 Details using HashMap
        Map<String, String> student3Details = new HashMap<>();
        student3Details.put("Name", "Mike Brown");
        student3Details.put("Age", "Twenty Two");
        student3Details.put("Gender", "Male");
        student3Details.put("Roll Number", "SBA12347");
        student3Details.put("Grade", "A+");
        student3Details.put("Major", "Physics");
        student3Details.put("GPA", "A3.9");
        student3Details.put("Email", "mike@example.com");
        student3Details.put("PAN Number", "TYR6543212");
        student3Details.put("Address", "789 Pine St");
		System.out.println("Student3 Details :"+student3Details);
		
		//Lets store Studnt3 data into List
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(student1Details);
		studentList.add(student2Details);
		studentList.add(student3Details);
		System.out.println("Final Employee List :"+studentList);
		System.out.println("************************************");
		System.out.println("************************************");
		
		/********* EMPLOYEE DETAILS *****/
		
		//Store employee1 Details using HashMap
		Map<String, String> employee1Details = new HashMap<String,String>();
		employee1Details.put("Employee ID", "E001");
		employee1Details.put("Name", "Alice Green");
		employee1Details.put("Age", "Thirty");
		employee1Details.put("Gender", "Female");
		employee1Details.put("Department", "Engineering");
		employee1Details.put("Position", "Software Engineer");
		employee1Details.put("Salary", "75K Pounds");
		employee1Details.put("Email", "alice@example.com");
		employee1Details.put("PAN Number", "SDF6543210");
		System.out.println("employee1 Details :"+employee1Details);
		
		//Store employee2 Details using HashMap
		Map<String, String> employee2Details = new HashMap<String,String>();
		employee2Details.put("Employee ID", "E002");
		employee2Details.put("Name", "Bob Johnson");
		employee2Details.put("Age", "Thirty Five");
		employee2Details.put("Gender", "Male");
		employee2Details.put("Department", "Marketing");
		employee2Details.put("Position", "Marketing Manager");
		employee2Details.put("Salary", "85K Pounds");
		employee2Details.put("Email", "bob@example.com");
		employee2Details.put("PAN Number", "REW6543211");
		System.out.println("employee2 Details :"+employee2Details);
		
		//Store employee3 Details using HashMap
		Map<String, String> employee3Details = new HashMap<String,String>();
		employee3Details.put("Employee ID", "E003");
		employee3Details.put("Name", "Carol White");
		employee3Details.put("Age", "Twenty Eight");
		employee3Details.put("Gender", "Female");
		employee3Details.put("Department", "Sales");
		employee3Details.put("Position", "Sales Executive");
		employee3Details.put("Salary", "65K Pounds");
		employee3Details.put("Email", "carol@example.com");
		employee3Details.put("PAN Number", "TRY6543212");
		System.out.println("employee3 Details :"+employee3Details);

		
		//Lets store Employee data into List
		List<Map<String, String>> empList = new ArrayList<Map<String, String>>();
		empList.add(employee1Details);
		empList.add(employee2Details);
		empList.add(employee3Details);
		System.out.println("Final Employee List :"+empList);
		System.out.println("************************************");
		
		
		/********* PRODUCT DETAILS *****/
		
		//Store product1 Details using HashMap
		Map<String, String> product1Details = new HashMap<String,String>();
		product1Details.put("Product ID", "P001");
		product1Details.put("Name", "Laptop");
		product1Details.put("Category", "Electronics");
		product1Details.put("Price", "12K Pounds");
		product1Details.put("Stock Quantity", "Not Available");
		product1Details.put("Supplier", "Tech Supplies");
		product1Details.put("Warranty", "2 Years");
		product1Details.put("Rating", "4.5 Stars");
		product1Details.put("Manufacturing Date", "Aug 2023");
		product1Details.put("Expiry Date", "Aug 2028");
		System.out.println("product1 Details :"+product1Details);
		
		//Store product2 Details using HashMap
		Map<String, String> product2Details = new HashMap<String,String>();
		product2Details.put("Product ID", "P002");
		product2Details.put("Name", "Desk Chair");
		product2Details.put("Category", "Furniture");
		product2Details.put("Price", "150j Pounds");
		product2Details.put("Stock Quantity", "Two");
		product2Details.put("Supplier", "Office Depot");
		product2Details.put("Warranty", "1 Years");
		product2Details.put("Rating", "4 Stars");
		product2Details.put("Manufacturing Date", "Sep 2024");
		product2Details.put("Expiry Date", "N/A");
		System.out.println("product2 Details :"+product2Details);
		
		//Store product3 Details using HashMap
		Map<String, String> product3Details = new HashMap<String,String>();
		product3Details.put("Product ID", "P003");
		product3Details.put("Name", "Coffee Maker");
		product3Details.put("Category", "Kitchen");
		product3Details.put("Price", "75 Pounds");
		product3Details.put("Stock Quantity", "Two Hundred");
		product3Details.put("Supplier", "Kitchen World");
		product3Details.put("Warranty", "6 Months");
		product3Details.put("Rating", "4.2 Stars");
		product3Details.put("Manufacturing Date", "Jan 2025");
		product3Details.put("Expiry Date", "Jan 2027");
		System.out.println("product3 Details :"+product3Details);
		
		//Lets store product data into List
		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		productList.add(product1Details);
		productList.add(product2Details);
		productList.add(product3Details);
		System.out.println("Final product List :"+productList);
		System.out.println("************************************");
		
		//Now Lets store all lists into Map
		Map<String, List<Map<String, String>>> globalData = new HashMap<String, List<Map<String, String>>>();
		globalData.put("StudentList",studentList);
		globalData.put("EmployeeList",empList);
		globalData.put("ProductList",productList);
		
		//Print the data from Product details > Supplier Name > Office Depot
		System.out.println("Print the data from Product details > Supplier Name > Office Depot ==>"+globalData.get("ProductList").get(1).get("Supplier"));
	}
		

}
