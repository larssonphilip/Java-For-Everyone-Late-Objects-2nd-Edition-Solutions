/**
 * Testprogram for the class "Student".
 */

public class P8_7_test {
	public static void main(String[] args) {
		Student student = new Student("Philip");
		student.addQuizScore(23);
		student.addQuizScore(13);
		student.addQuizScore(33);
		
		System.out.println(student.getName() + "s total score: " + student.getTotalScore());
		System.out.println(student.getName() + "s average score: " +  student.getAverageScore());
	}
}
