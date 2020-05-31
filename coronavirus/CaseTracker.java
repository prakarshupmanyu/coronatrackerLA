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
		System.out.println("US CASES - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.US_CASES, numDays);
	}
	
	private void trackUSDeaths(int numDays) {
		System.out.println("US DEATHS - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.US_DEATHS, numDays);
	}
	
	private void trackCaliforniaCases(int numDays) {
		System.out.println("CALIFORNIA CASES - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.CALIFORNIA_CASES, numDays);
	}
	
	private void trackCaliforniaDeaths(int numDays) {
		System.out.println("CALIFORNIA DEATHS - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.CALIFORNIA_DEATHS, numDays);
	}
	
	private void trackLACases(int numDays) {
		System.out.println("LOS ANGELES CASES - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.LA_CASES, numDays);
	}
	
	private void trackLADeaths(int numDays) {
		System.out.println("LOS ANGELES DEATHS - AVERAGE increase in " + numDays + " days:");
		printDaysAverage(NumberOfCases.LA_DEATHS, numDays);
	}
	
	public static void main(String[] args) {		
		CaseTracker tracker = new CaseTracker();
		//System.out.print(Integer.MAX_VALUE);
		int numDaysForAverage = 7;
		tracker.trackUSCases(numDaysForAverage);
		tracker.trackUSDeaths(numDaysForAverage);
		tracker.trackCaliforniaCases(numDaysForAverage);
		tracker.trackCaliforniaDeaths(numDaysForAverage);
		tracker.trackLACases(numDaysForAverage);
		tracker.trackLADeaths(numDaysForAverage);
	}
}
