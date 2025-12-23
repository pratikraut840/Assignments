package assignments;

public class Assignment11_PrimeNumber {

	public static void main(String[] args) {
		// Prime number starts from 2,3,7,11,13...
		// lets declare variable
		int number = 7;
		boolean isPrime = true;

		// exclude 1 from the prime number
		if (number <= 1) {
			System.out.println(number + " is not prime number");
			isPrime = false;
		}

		// check if number is divisible by 2 and output is 0
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		// check and print the number
		if (isPrime) {
			System.out.println(number + " is prime number");
		} else {
			System.out.println(number + " is not prime number");
		}

	}

}
