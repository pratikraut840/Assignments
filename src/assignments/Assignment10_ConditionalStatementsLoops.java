package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment10_ConditionalStatementsLoops {

	public static double calculateHike(double baseSalary, double variablePay, double rating) {

		int bonus = 0;
		int experience = 0;
		int reward = 0;

		if (rating >= 4) {
			variablePay = 15.0;
			bonus = 1500;

		} else if (rating >= 3 && rating < 4) {
			variablePay = 10.0;
			bonus = 1200;

		} else {
			variablePay = 3.0;
			bonus = 300;
		}

		if (experience >= 5) {
			reward = 500;
		}

		double hike = (baseSalary * variablePay / 100) + bonus + reward;

		return (hike / baseSalary) * 100;

	}

	public static void main(String[] args) {

		// Array to store employee names
		String[] empNames = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		// Multi array to store base salary, experience, year end rating
		Double[] emp1Data = { 75000.0, 5.1, 4.2 };
		Double[] emp2Data = { 68000.0, 3.2, 3.8 };
		Double[] emp3Data = { 82000.0, 7.1, 4.5 };
		Double[] emp4Data = { 90000.0, 10.2, 2.5 };
		Double[] emp5Data = { 60000.0, 2.4, 3.5 };

		// store the Values in Map with EmployeeName
		Map<String, Double[]> output = new HashMap<>();
		output.put(empNames[0], emp1Data);
		output.put(empNames[1], emp2Data);
		output.put(empNames[2], emp3Data);
		output.put(empNames[3], emp4Data);
		output.put(empNames[4], emp5Data);

		// Store hike data using Map
		Map<String, Double> hikeMap = new HashMap<>();

		for (String i : empNames) {
			Double[] data = output.get(i);
			double hikePercent = calculateHike(emp1Data[0], emp1Data[1], emp1Data[2]);
			hikeMap.put(i, hikePercent);

		}

		System.out.println("Hike percent for each employee");
		for (String emp : empNames) {
			System.out.println(emp + " : " + hikeMap.get(emp) + "%");

		}

	}

}
