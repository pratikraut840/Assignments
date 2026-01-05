package assignments;

public class Assignment14_PyramidShapeNumbers {

	public static void main(String[] args) {

		int numbers = 5; // total numbers are 1-5

		// print upper half
		for (int i = 1; i <= numbers; i++) { // Increasing loop

			// print space logically before the numbers
			for (int space = 1; space <= numbers - i; space++) { // Spaces decrease as i increases
				System.out.print(" ");
			}

			// print number logically and space after space
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println(); // Move to next line after one outer loop iteration
		}

		// print lower half
		for (int i = numbers - 1; i >= 1; i--) { // decreasing loop

			// print space logically before the numbers
			for (int space = 1; space <= numbers - i; space++) { // Spaces decrease as i increases
				System.out.print(" ");
			}

			// print number logically and space after space
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // Move to next line after one outer loop iteration
		}

	}

}
