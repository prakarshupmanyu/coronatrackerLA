package coronavirus;

public class CaseTracker {
	
	private void printDayWiseDiff(int[] dayWiseCounts) {
		int yesterdayCount = dayWiseCounts[0];
		for (int day = 1; day < dayWiseCounts.length; day++) {
			int todayCount = dayWiseCounts[day];
			int increase = todayCount - yesterdayCount;
			System.out.println("Day " + day + "\t :: " + increase);
			yesterdayCount = todayCount;
		}
		System.out.println();
	}
	
	private void trackUSCases() {
		System.out.println("Number of US CASES increase by day:");
		printDayWiseDiff(NumberOfCases.US_CASES);
	}
	
	private void trackUSDeaths() {
		System.out.println("Number of US DEATHS increase by day:");
		printDayWiseDiff(NumberOfCases.US_DEATHS);
	}
	
	private void trackCaliforniaCases() {
		System.out.println("Number of CALIFORNIA CASES increase by day:");
		printDayWiseDiff(NumberOfCases.CALIFORNIA_CASES);
	}
	
	private void trackCaliforniaDeaths() {
		System.out.println("Number of CALIFORNIA DEATHS increase by day:");
		printDayWiseDiff(NumberOfCases.CALIFORNIA_DEATHS);
	}
	
	private void trackLACases() {
		System.out.println("Number of LOS ANGELES CASES increase by day:");
		printDayWiseDiff(NumberOfCases.LA_CASES);
	}
	
	private void trackLADeaths() {
		System.out.println("Number of LOS ANGELES DEATHS increase by day:");
		printDayWiseDiff(NumberOfCases.LA_DEATHS);
	}
	
	public static void main(String[] args) {		
		CaseTracker tracker = new CaseTracker();
		//System.out.print(Integer.MAX_VALUE);
		tracker.trackUSCases();
		tracker.trackUSDeaths();
		tracker.trackCaliforniaCases();
		tracker.trackCaliforniaDeaths();
		tracker.trackLACases();
		tracker.trackLADeaths();
	}
}
