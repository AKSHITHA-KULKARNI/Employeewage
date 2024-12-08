public class TotalWages {
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;

    public int calculateTotalWage() {
        int totalHours = 0, totalDays = 0, totalWage = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            int hoursWorked = (int) (Math.random() * 9); // Random hours (0-8)
            totalHours += hoursWorked;
            totalWage += hoursWorked * WAGE_PER_HOUR;
            totalDays++;
        }
        return totalWage;
    }
}
