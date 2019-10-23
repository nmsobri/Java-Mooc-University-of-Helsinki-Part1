
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = new Grade(scanner);

		ArrayList<Integer> grades = grade.getScores();
		grade.printGradeDistribution(grades);
	}

}
