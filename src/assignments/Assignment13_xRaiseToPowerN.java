package assignments;

public class Assignment13_xRaiseToPowerN {

	public static double calculateXPower(double x, int n) {

		// if any number raised to power 0 is 1 and return 1.0
		if (n == 0) {
			return 1.0;
		}

		long exp = n; // store n in a long

		// Checks if the exponent is negative and convert negative power into positive
		if (exp < 0) {
			x = 1 / x;
			exp = -exp;
		}

		double result = 1.0; // initialize result
		for (long i = 0; i < exp; i++) {
			result = result * x;
		}
		// Returns the final computed power
		return result;
	}

	public static void main(String[] args) {

		System.out.println(calculateXPower(5, 3));

	}

}
