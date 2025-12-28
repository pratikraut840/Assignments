package assignments;

public class Assignment13_xRaiseToPowerN {

	public static double calculateXPower(double number, int power) {

		// if any number raised to power 0 is 1 then return 1.0
		if (power == 0) {
			return 1.0;
		}

		// Checks if the exponent is negative then convert negative power into positive
		if (power < 0) {
			number = 1 / number;
			power = -power;
		}

		double result = 1.0; // initial result
		for (int i = 0; i < power; i++) {
			result = result * number;
		}
		// Returns the final computed power
		return result;
	}

	public static void main(String[] args) {
		System.out.println(calculateXPower(5, 3));
	}

}
