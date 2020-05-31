package coronavirus;

public class CaseTracker {
	
	private void printDaysAverage(int[] dayWiseCounts, int daysForAverage) {
		int increaseSum = 0;
		int yesterdayCount = dayWiseCounts[0];
		int windowStartIdx = 0;
		for (int i = 1; i < dayWiseCounts.length; i++) {
			int increase = dayWiseCounts[i] - yesterdayCount;
			increaseSum += increase;
			if (i < daysForAverage) {
				yesterdayCount = dayWiseCounts[i];
				continue;
			}
			int avg = (int) increaseSum / daysForAverage;
			System.out.println("Day " + (i - daysForAverage + 1) + "\t :: " + avg);
			increaseSum -= (dayWiseCounts[windowStartIdx + 1] - dayWiseCounts[windowStartIdx]);
			windowStartIdx++;
			yesterdayCount = dayWiseCounts[i];
		}
		System.out.println();
	}
	
	private void trackUSCases(int numDays) {
		System.out.println("Number of US CASES increase by day:");
		printDaysAverage(NumberOfCases.US_CASES, numDays);
	}
	
	private void trackUSDeaths(int numDays) {
		System.out.println("Number of US DEATHS increase by day:");
		printDaysAverage(NumberOfCases.US_DEATHS, numDays);
	}
	
	private void trackCaliforniaCases(int numDays) {
		System.out.println("Number of CALIFORNIA CASES increase by day:");
		printDaysAverage(NumberOfCases.CALIFORNIA_CASES, numDays);
	}
	
	private void trackCaliforniaDeaths(int numDays) {
		System.out.println("Number of CALIFORNIA DEATHS increase by day:");
		printDaysAverage(NumberOfCases.CALIFORNIA_DEATHS, numDays);
	}
	
	private void trackLACases(int numDays) {
		System.out.println("Number of LOS ANGELES CASES increase by day:");
		printDaysAverage(NumberOfCases.LA_CASES, numDays);
	}
	
	private void trackLADeaths(int numDays) {
		System.out.println("Number of LOS ANGELES DEATHS increase by day:");
		printDaysAverage(NumberOfCases.LA_DEATHS, numDays);
	}
	
	public static void main(String[] args) {		
		CaseTracker tracker = new CaseTracker();
		//System.out.print(Integer.MAX_VALUE);
		tracker.trackUSCases(1);
		tracker.trackUSDeaths(1);
		tracker.trackCaliforniaCases(1);
		tracker.trackCaliforniaDeaths(1);
		tracker.trackLACases(1);
		tracker.trackLADeaths(1);
	}
}
