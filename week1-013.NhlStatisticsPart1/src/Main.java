
import nhlstats.NHLStatistics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Top ten by points");
		NHLStatistics.sortByGoals();
		NHLStatistics.top(10);

		System.out.println("");
		System.out.println("Top 25 by penaties");
		NHLStatistics.sortByPenalties();
		NHLStatistics.top(25);

		System.out.println("");
		System.out.println("Stats for Sidney Crosby");
		NHLStatistics.searchByPlayer("Sidney Crosby");

		System.out.println("");
		System.out.println("Stats for Team Philadelphia Flyers");
		NHLStatistics.teamStatistics("PHI");  // Statistics of New York Rangers

		System.out.println("");
		System.out.println("Stats for Team Anaheim Ducks");
		NHLStatistics.sortByPoints();
		NHLStatistics.teamStatistics("ANA");
	}
}
