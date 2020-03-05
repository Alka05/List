package list;

public class Count_Element {

	public static void main(String[] args) {
		int count = 0;
		int[] numbers = { 50, 40, 23, 70, 56, 12, 5, 10, 7 };
		for (int i = 0; i < numbers.length; i++) {

			count = count + 1;
		}

		System.out.println(count);
	}

}
