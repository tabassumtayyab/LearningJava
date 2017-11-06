
public class IfElseAssignment {

	public static void main(String[] args) {

		// Homework: Create value2, comparison2, give them any numbers we want
		// Create value3, comparison3, give them any numbers we want
		// Repeat the if statement right below this

		int value = 30;
		int comparison = 25;
		int value2 = 50;
		int comparison2 = 190;
		int value3 = 78;
		int comparison3 = 100;
		int difference = (value - comparison);
		int difference1 = (value2 - comparison2);
		int difference2 = (value3 - comparison3);

		if (value > comparison) {

			System.out.println(value + " is greater then " + comparison);
			System.out.println("Difference between value and comparison =" + difference);

		} else if (value < comparison) {

			System.out.println(value + " is lower then " + comparison);
			System.out.println("Difference between value and comparison =" + difference);

		}

		if (value2 > comparison2) {

			System.out.println(value2 + " is greater then " + comparison2);
			System.out.println("Difference between value2 and comparison2 =" + difference1);

		} else if (value2 < comparison2) {

			System.out.println(value2 + " is lower then " + comparison2);
			System.out.println("Difference between value2 and comparison2 =" + difference1);

		}

		if (value3 > comparison3) {

			System.out.println(value3 + " is greater then " + comparison3);
			System.out.println("Difference between value3 and comparison3 =" + difference2);

		} else if (value3 < comparison3) {

			System.out.println(value3 + " is lower then " + comparison3);
			System.out.println("Difference between value3 and comparison3 =" + difference2);

		}

		int abs = (comparison - value);
		if (abs < 0) {
			abs = abs * -1;
		}
		System.out.println("Absolute value = " + abs);

		int abs2 = (value2 - comparison2);
		if (abs2 < 0) {
			abs2 = abs2 * -1;
		}
		System.out.println("Absolute value = " + abs2);

		int abs3 = (value3 - comparison3);
		if (abs3 < 0) {
			abs3 = abs3 * -1;
		}
		System.out.println("Absolute value = " + abs3);

	}
}
