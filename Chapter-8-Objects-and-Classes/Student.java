/**
 * Implement a class Student. For the purpose of this exercise, a student has a name and a
 * a total quiz score. Supply an appropriate constructor and methods getName(), 
 * addQuiz(int score), getTotalScore() and getAverageScore(). To compute the latter, you also
 * need to store the number of quizzes the student took.
 */
 
public class Student {
	private int quizCount;
	private int totalScore;
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public void addQuizScore(int score) {
		totalScore += score;
		quizCount++;
	}

	public String getName() {
		return name;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
  
	public int getAverageScore() {
		return totalScore / quizCount;
	}
}
