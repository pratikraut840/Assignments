package arrays;

import java.util.HashMap;
import java.util.Map;

public class s2 {

	double baseSalary = 0;
	double variablePay = 0;
	int reward = 0;
	int bonus = 0;
	double experience = 0;

	// method to calculateHike
	double calculateHike(double baseSalary, double variablePay, double rating) {

		if (rating >= 4.0) {
			variablePay = 15;
			bonus = 1500;
		} else if (rating >= 3 && rating < 4) {
			variablePay = 10;
			bonus = 1200;
		} else {
			variablePay = 3;
			bonus = 300;
		}

		if (experience >= 5) {
			reward = 5000;
		}

		double hike = (baseSalary * variablePay / 100) + bonus + reward;

		double hikePercent = (hike / baseSalary) * 100;
		return hikePercent;
	}

	public static void main(String[] args) {

		s2 obj = new s2();

		// Store employee using array
		String[] empNames = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		// Store employee data using array
		Double[] empData1 = { 75000.0, 5.1, 4.2 };
		Double[] empData2 = { 68000.0, 3.2, 3.8 };
		Double[] empData3 = { 82000.0, 7.1, 4.5 };
		Double[] empData4 = { 90000.0, 10.2, 2.5 };
		Double[] empData5 = { 60000.0, 2.4, 3.5 };

		// store complete employee with data
		Map<String, Double[]> empData = new HashMap<String, Double[]>();
		empData.put(empNames[0], empData1);
		empData.put(empNames[1], empData2);
		empData.put(empNames[2], empData3);
		empData.put(empNames[3], empData4);
		empData.put(empNames[4], empData5);

		// Create hikeMap to store entire data using loop
		Map hikeMap = new HashMap<String, Double>();

		// calculate hike percent for all employees
		for (int i = 0; i < empData.size(); i++) {
			String emp = empNames[i];
			Double[] data = empData.get(emp);
			double hikePercent = obj.calculateHike(data[0], data[1], data[2]);

			hikeMap.put(emp, hikePercent);
		}

		// print hike percent for all employees
		System.out.println("Hike Percentage for each employee: ");
		for (int i = 0; i < empNames.length; i++) {
			System.out.println(empNames[i] + ":" + hikeMap.get(empNames[i]) + "%");

		}

	}

}
