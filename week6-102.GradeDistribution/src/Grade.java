
import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

	private Scanner scanner;
	private int scoreCounter = 0;

	public Grade(Scanner scanner) {
		this.scanner = scanner;
	}

	public ArrayList<Integer> getScores() {
		ArrayList<Integer> grades = new ArrayList<Integer>();

		System.out.println("Type exam scores, -1 to end:");
		while (true) {
			int grade = Integer.parseInt(this.scanner.nextLine());

			if (grade == -1) {
				break;
			}

			if (grade >= 0 && grade <= 60) {
				grades.add(grade);
				this.scoreCounter++;
			}
		}

		return grades;
	}

	public int[] gradesDistrubution(ArrayList<Integer> scores) {
		int[] gradesRank = {0, 0, 0, 0, 0, 0};

		for (int grade : scores) {
			if (grade > 49) {
				gradesRank[5]++;
			} else if (grade > 44) {
				gradesRank[4]++;
			} else if (grade > 39) {
				gradesRank[3]++;
			} else if (grade > 34) {
				gradesRank[2]++;
				System.out.println("Grade: " + 2);
			} else if (grade > 29) {
				gradesRank[1]++;
			} else {
				gradesRank[0]++;
			}
		}

		return gradesRank;

	}

	public int totalScores(ArrayList<Integer> scores) {
		int totalScores = 0;

		for (int score : scores) {
			totalScores += score;
		}

		return totalScores;
	}

	public int totalAccepted(int[] scores) {
		int totalAccepted = 0;

		for (int i = 1; i < scores.length; i++) {
			totalAccepted += scores[i];
		}

		return totalAccepted;
	}

	public double acceptancePercentage(int totalAccepted) {
		System.out.println(totalAccepted);
		System.out.println(this.scoreCounter);
		return totalAccepted / (this.scoreCounter * 1.0) * 100;
	}

	public void printGradeDistribution(ArrayList<Integer> scores) {
		int[] gradeDistribution = gradesDistrubution(scores);

		System.out.println("Grade distribution:");

		for (int i = gradeDistribution.length - 1; i >= 0; i--) {
			System.out.print(i + ": ");

			for (int j = 0; j < gradeDistribution[i]; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		double percentage = acceptancePercentage(totalAccepted(gradeDistribution));
		System.out.println("Acceptance percentage: " + percentage);
	}

}
