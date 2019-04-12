package oppconcepts;

public class AddingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayGrade("John",findGrade(88));
		
		
	}
	
	private static String findGrade(int score) {
		
		String grade;
		if(score>=90 &&score<=100) {
			grade = "A";
		} else if (score >= 80 && score <90) {
			grade = "B";
		} else if (score >= 70 && score < 80 ) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}

	private static void displayGrade(String studentName, String grade) {
		System.out.println(studentName + " scorde :"+ grade);
	}

}
