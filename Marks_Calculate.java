package list;

public class Marks_Calculate {

	public static void main(String[] args) {
		int[] student_marks = { 23, 45, 89, 90, 56, 80 };// list of student
		int total_marks = 0;// for sum all student list
		for (int index = 0; index < student_marks.length; index++) {// loop is working till student_marks list
			total_marks = student_marks[index] + total_marks;// sum of total student marks and increment in total_marks

		}

		System.out.println("Total_marks" + " " + total_marks);// print out of loop so its give use total marks sum
	}
}
