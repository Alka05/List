package list;

public class Marks_Question {

	public static void main(String[] args) {
		int[] student_marks = { 23, 45, 67, 89, 90, 54, 34, };// list of marks
		int less_than50 = 0;// variable for storing less than 50 marks
		int more_than50 = 0;// variable for storing more than 50 marks
		for (int index = 0; index < student_marks.length; index++) {// loop working till student marks list
			int marks = student_marks[index];// checking marks equal to student_marks lenght
			if (marks < 50) {// checking marks less than 50
				less_than50 = less_than50 + 1;// increment in less than50 marks
			} else {
				more_than50 = more_than50 + 1;// increment in more than50 marks
			}
		}
		System.out.println("marks more_than50" + " " + more_than50);// use print for marks total number more than 50

		System.out.println("marks less_than50" + " " + less_than50);// use print for marks total number of less than 50



	}

}
