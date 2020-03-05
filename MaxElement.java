package list;

public class MaxElement {

	public static void main(String[] args) {
		int[] number = { 50, 40, 23, 70, 56, 12, 5, 10, 7 };
		int max = 0;
		for (int num = 1; num < number.length; num++) {
			if (number[num] > max) {
				max = number[num];
			}

		}
		System.out.println("max is" + " " + max);
	}

}
