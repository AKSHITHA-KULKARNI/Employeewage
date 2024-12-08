public class EmployeeWage {
    // Class Variables
    private static final int EMP_RATE_PER_HOUR = 20;  // Rate per hour of work
    private static final int FULL_TIME_HOURS = 8;     // Full-time work hours
    private static final int PART_TIME_HOURS = 4;     // Part-time work hours
    private static final int MAX_WORKING_DAYS = 20;   // Maximum working days
    private static final int MAX_WORKING_HOURS = 100; // Maximum working hours

    // Class Method to Compute Total Wage
    public static int computeEmployeeWage() {
        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        while (totalDaysWorked < MAX_WORKING_DAYS && totalHoursWorked < MAX_WORKING_HOURS) {
            totalDaysWorked++;
            int dailyHoursWorked = (Math.random() > 0.5) ? FULL_TIME_HOURS : PART_TIME_HOURS; // Randomly choose between full-time or part-time
            totalHoursWorked += dailyHoursWorked;
            int dailyWage = dailyHoursWorked * EMP_RATE_PER_HOUR;
            totalWage += dailyWage;
            System.out.println("Day " + totalDaysWorked + ": Worked " + dailyHoursWorked + " hours, Daily Wage = $" + dailyWage);
        }

        System.out.println("Total Wage for the month (up to " + MAX_WORKING_DAYS + " days or " + MAX_WORKING_HOURS + " hours) is: $" + totalWage);
        return totalWage;
    }
}
