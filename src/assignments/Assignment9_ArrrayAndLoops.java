package assignments;

public class Assignment9_ArrrayAndLoops {

	public static void main(String[] args) {
		// Given values are 12 ,34,11,36,87,98,93.
		// Store the values in Array and Print second and third largest number from the
		// above values without using collections and default sort methods

		// Store the values in Array
		int[] array = new int[7];
		array[0] = 12;
		array[1] = 34;
		array[2] = 11;
		array[3] = 36;
		array[4] = 87;
		array[5] = 98;
		array[6] = 93;

		// Using Integer wrapper class to deal with array values and storing as int to
		// build the logic
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			// check if current value is greater than largest value
			if (array[i] > firstLargest) {

				thirdLargest = secondLargest; // Move second largest value to third
				secondLargest = firstLargest; // Move largest value to second
				firstLargest = array[i]; // update the largestValue

				// Check If current value is smaller than first but greater than second
			} else if (array[i] > secondLargest) {

				thirdLargest = secondLargest; // Move second largest value to third
				secondLargest = array[i]; // Update second largest value

				// If current value is smaller than second but greater than third
			} else if (array[i] > thirdLargest) {

				thirdLargest = array[i]; // Update third largest value
			}

		}
		// Print the first largest number
		System.out.println("firstLargest :" + firstLargest);

		// Print the second largest number
		System.out.println("secondLargest :" + secondLargest);

		// Print the third largest number
		System.out.println("thirdLargest :" + thirdLargest);
	}

}
