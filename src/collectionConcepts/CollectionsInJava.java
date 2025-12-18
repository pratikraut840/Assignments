package collectionConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsInJava {

	public static void main(String[] args) {
		
		//Array: Array is a non-primitive datatype. Array can store multiple values with similar datatypes together at one place.
		
		String[] empNames = new String[3];
		empNames[0] = "RAJ";
		empNames[1] = "OM";
		empNames[2] = "SHYAM";
		
		System.out.println("Length of employeeNames Array is :"+empNames.length);
		
		/**** Brackets in Java ****/
		//	Curly braces {}  -Block scope/class scope
		//	Square braces[]  -Arrays
		//	Round braces()   -Methods
		//	Angle braces<>   -Always use for non-primitive data type
		
		/**********CHALLENGES WITH ARRAYS**********/
		
		//1. Fixed Size: Once the array is created, we cannot change its size.
		//2. Homogeneous Data: Arrays can only store elements of the same datatype.
		//3. An array follows static memory allocation, and it can consume memory at the very beginning itself.
		//4. Array won't allow modifications to structure during runtime.
		
		/**********COLLECTIONS FRAMEWORK**********/
		
		//Benefits of Collections Framework over Arrays:
		
		//1. Dynamic Size: Collections can grow and shrink in size as needed.
		//2. Heterogeneous Data: Collections can store elements of different datatypes together.
		//3. Collections follow dynamic memory allocation, and memory is allocated as needed during runtime.
		//4. Collections allow modifications to structure during runtime.
		
		//Major 3  categories of collections that we are going to use in our day-to-day automation life cycle.
		
		//1. List ==> ArrayList, LinkedList
		//   List can store multiple values with similar datatypes together at one place dynamically.
		//   List allows duplicate values.
		//   List follows dynamic memory allocation.
		//   List allows modifications to structure during runtime.		
		
		//2. Set ==> HashSet, LinkedHashSet, TreeSet
		//   Set can store multiple values with similar datatypes together at one place dynamically.
		//   Set won't allow duplicate values.
		//   Set follows dynamic memory allocation.
		//   Set allows modifications to structure during runtime.	
				
		//3. Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		//   Map can store multiple values with different datatypes together in key-value pairs at one place dynamically.
		//   Map won't allow duplicate keys but allows duplicate values.
		//   Map follows dynamic memory allocation.
		//   Map allows modifications to structure during runtime.	
		
		/*** Limitations of collection ***/ 
		// Collections are dynamic in nature and store only non-primitive data types
		// Collection does not allow to store primitive data types
	
		/*** Solution Available: Wrapper Classes  ***/
			// Wrapper Class: This is used to convert primitive data types into class data types
			// Java created customized wrapper classes for all primitive data types to store dynamic data 
			// Wrapper class allow to store primitive data types
	
		/*** There are 8 primitive data types so as 8 wrapper classes in java ***/
			//	byte > Byte
			//	short > Short
			//	int > Integer
			//	long > Long
			//	float > Float
			//	double > Double
			//	boolean > Boolean
			//	char > Character
		
		//import : To provide reference to the implement JRE library files
			
		
		/****************SYNTAX TO STORE VALUES IN COLLECTIONS****************/ // (), {}, [], <>
		//COLLECTION<DataType> variable = new COLLECTION<DataType>();
		//Only Non-primitive datatypes are allowed in Collections Framework.		
		
		//Wrapper Class ==> Class form of primitive datatypes. int -> Integer 
		//Wrapper classes: Integer, Character, Double, Boolean, Float, Long, Short, Byte
		
		/*****************************DIFFERENCE BETWEEN EACH SUB-CATEGORY OF LIST, SET & MAP*****************************/		
		// 1. Order of storing values : insertion order ,random order,ascending order.
		// 2. Allowing null values : allowed, not allowed.
		// 3. Memory  Allocation : contiguous memory allocation, non-contiguous memory allocation.		
		
		/*****************************ORDER OF STORING*****************************/
		//Hash ==> Random Order
		//Link ==> Insertion Order
		//Tree ==> Ascending Order
		
		/*************** ArrayList ***********/
		System.out.println("************ArrayList*************");
		// Syntax to create an ArrayList: List<DataTypes> variable = new ArrayList<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: ArrayList follows insertion order
		//duplicate: ArrayList allow duplicates
		//Memory allocation: Contiguous memory allocation
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("John");
		empNamesArrayList.add("Ray");
		empNamesArrayList.add("Sam");
		empNamesArrayList.add("Nick");
		empNamesArrayList.add("Rio");
		empNamesArrayList.add(null);
		empNamesArrayList.add("Amy");
		empNamesArrayList.add("Sam"); // duplicate
		empNamesArrayList.remove("John");
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(2));
		System.out.println(empNamesArrayList);
		System.out.println();
		
		/*************** LinkedList ***********/
		System.out.println("************LinkedList*************");
		// Syntax to create an LinkedList: List<DataTypes> variable = new LinkedList<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: LinkedList follows insertion order
		//null: LinkedList allow null values
		//duplicate: LinkList allow duplicates
		//Memory allocation: Non Contiguous memory allocation
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Ray");
		empNamesLinkedList.add("Sam");
		empNamesLinkedList.add("Nick");
		empNamesLinkedList.add("Rio");
		empNamesLinkedList.add("Amy");
		empNamesLinkedList.add(null);
		empNamesLinkedList.add("Sam"); // duplicate
		empNamesLinkedList.remove("John");
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(2));
		System.out.println(empNamesLinkedList);
		System.out.println();
		
		
		/*************** HashSet ***********/
		System.out.println("************HashSet*************");
		// Syntax to create an HashSet: List<DataTypes> variable = new HashSet<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: HashSet follows Random order
		//null: HashSet allow null values
		//duplicate: HashSet does not allow duplicates
		//Memory allocation: Non Contiguous memory allocation
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("John");
		empNamesHashSet.add("Ray");
		empNamesHashSet.add("Sam");
		empNamesHashSet.add("Nick");
		empNamesHashSet.add("Rio");
		empNamesHashSet.add("Amy");
		empNamesHashSet.add(null);
		empNamesHashSet.add("Sam"); // duplicate
		empNamesHashSet.remove("John");
		System.out.println(empNamesHashSet.size());
//		System.out.println(empNamesHashSet.get());// get() not supported because set doesn't have Index
		System.out.println(empNamesHashSet);
		System.out.println();
		
		
		/*************** LinkedHashSet ***********/
		System.out.println("************LinkedHashSet*************");
		// Syntax to create an LinkedHashSet: List<DataTypes> variable = new LinkedHashSet<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: LinkedHashSet follows Insertion order
		//null: LinkedHashSet allow null values
		//duplicate: LinkedHashSet does not allow duplicates
		//Memory allocation: Non Contiguous memory allocation
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Ray");
		empNamesLinkedHashSet.add("Sam");
		empNamesLinkedHashSet.add("Nick");
		empNamesLinkedHashSet.add("Rio");
		empNamesLinkedHashSet.add("Amy");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.add("Sam"); // duplicate
		empNamesLinkedHashSet.remove("John");
		System.out.println(empNamesLinkedHashSet.size());
//		System.out.println(empNamesLinkedHashSet.get());// get() not supported because set doesn't have Index
		System.out.println(empNamesLinkedHashSet);
		System.out.println();
		
		/*************** TreeSet ***********/
		System.out.println("************TreeSet*************");
		// Syntax to create an TreeSet: List<DataTypes> variable = new TreeSet<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: TreeSet follows Sorted/Ascending order
		//null: TreeSet now allow null values
		//duplicate: TreeSet does not allow duplicates
		//Memory allocation: Non Contiguous memory allocation
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("John");
		empNamesTreeSet.add("Ray");
		empNamesTreeSet.add("Sam");
		empNamesTreeSet.add("Nick");
		empNamesTreeSet.add("Rio");
		empNamesTreeSet.add("Amy");
//		empNamesTreeSet.add(null); //NullPointerExpection
		empNamesTreeSet.add("Sam"); // duplicate
		empNamesTreeSet.remove("John");
		System.out.println(empNamesTreeSet.size());
//		System.out.println(empNamesTreeSet.get());// get() not supported because set doesn't have Index
		System.out.println(empNamesTreeSet);
		System.out.println();
		
		
		/*************** HashMap ***********/
		System.out.println("************HashMap*************");
		// Syntax to create an HashMap: List<DataTypes> variable = new HashMap<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: HashMap follows Random order
		//null: HashMap allow one null key and null values
		//duplicate: HashMap does not allow duplicates keys
		//Memory allocation: Non Contiguous memory allocation
		
		Map<String,String> empNamesHashMap = new HashMap<String,String>();
		empNamesHashMap.put("name","John");
		empNamesHashMap.put("RollNo","1122");
		empNamesHashMap.put("City","Mumbai");
		empNamesHashMap.put("Address","Pune");
		empNamesHashMap.put("Skin","FAIR");
		empNamesHashMap.put("Texture","Complex");
		empNamesHashMap.put("Texture","Complex"); // duplicate
		empNamesHashMap.put(null,null);
		empNamesHashMap.put("Sam",null); 
		empNamesHashMap.put(null,"Sam"); 
		System.out.println(empNamesHashMap.size());
//		System.out.println(empNamesHashMap.get());// get() not supported
		System.out.println(empNamesHashMap);
		System.out.println();
		
		/*************** LinkedHashMap ***********/
		System.out.println("************LinkedHashMap*************");
		// Syntax to create an LinkedHashMap: List<DataTypes> variable = new LinkedHashMap<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: LinkedHashMap follows Insertion order
		//null: LinkedHashMap allow one null key and null values
		//duplicate: LinkedHashMap does not allow duplicates keys
		//Memory allocation: Non Contiguous memory allocation
		
		Map<String,String> empNamesLinkedHashMap = new LinkedHashMap<String,String>();
		empNamesLinkedHashMap.put("name","John");
		empNamesLinkedHashMap.put("RollNo","1122");
		empNamesLinkedHashMap.put("City","Mumbai");
		empNamesLinkedHashMap.put("Address","Pune");
		empNamesLinkedHashMap.put("Skin","FAIR");
		empNamesLinkedHashMap.put("Texture","Complex");
		empNamesLinkedHashMap.put("Texture","Complex"); // duplicate
		empNamesLinkedHashMap.put(null,null);
		empNamesLinkedHashMap.put("Sam",null); 
		empNamesLinkedHashMap.put(null,"Sam"); 
		System.out.println(empNamesLinkedHashMap.size());
//		System.out.println(empNamesLinkedHashMap.get());// get() not supported
		System.out.println(empNamesLinkedHashMap);
		System.out.println();
		
		
		
		/*************** TreeMap ***********/
		System.out.println("************TreeMap*************");
		// Syntax to create an TreeMap: List<DataTypes> variable = new TreeMap<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: TreeMap follows Insertion order
		//null: TreeMap allow null values but not null keys
		//duplicate: TreeMap does not allow duplicates keys
		//Memory allocation: Non Contiguous memory allocation
		
		Map<String,String> empNamesTreeMap = new TreeMap<String,String>();
		empNamesTreeMap.put("name","John");
		empNamesTreeMap.put("RollNo","1122");
		empNamesTreeMap.put("City","Mumbai");
		empNamesTreeMap.put("Address","Pune");
		empNamesTreeMap.put("Skin","FAIR");
		empNamesTreeMap.put("Texture","Complex");
		empNamesTreeMap.put("Texture","Complex"); // duplicate
//		empNamesTreeMap.put(null,null); //Null key Not allowed
		empNamesTreeMap.put("Sam",null); 
//		empNamesTreeMap.put(null,"Sam");  //Null key values Not allowed
		System.out.println(empNamesTreeMap.size());
//		System.out.println(empNamesTreeMap.get());// get() not supported
		System.out.println(empNamesTreeMap);
		System.out.println();
		
		
		/*************** Hashtable ***********/
		System.out.println("************Hashtable*************");
		// Syntax to create an Hashtable: List<DataTypes> variable = new Hashtable<DataTypes>();
		// Syntax to add values: variable.add("Raj");
		// Syntax to remove values: variable.remove("Om");
		// Syntax to access values: variable.get(index);
		// Syntax to get size: variable.size();
		
		//Order: Hashtable follows Random order
		//null: Hashtable not allow null keys and null values
		//duplicate: Hashtable does not allow duplicates keys
		//Memory allocation: Non Contiguous memory allocation
		
		Map<String,String> empNamesHashtable = new Hashtable<String,String>();
		empNamesHashtable.put("name","John");
		empNamesHashtable.put("RollNo","1122");
		empNamesHashtable.put("City","Mumbai");
		empNamesHashtable.put("Address","Pune");
		empNamesHashtable.put("Skin","FAIR");
		empNamesHashtable.put("Texture","Complex");
		empNamesHashtable.put("Texture","Complex"); // duplicate
//		empNamesHashtable.put(null,null); //Null key values Not allowed
//		empNamesHashtable.put("Sam",null); //Null key values Not allowed
//		empNamesHashtable.put(null,"Sam");  //Null key values Not allowed
		System.out.println(empNamesHashtable.size());
//		System.out.println(empNamesHashtable.get());// get() not supported
		System.out.println(empNamesHashtable);
		System.out.println();
		
		
		
		
		
		



	}

}
