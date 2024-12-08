public class EmployeeWageForCompanies {
    // Method to compute the total employee wage for a company
    public static void computeEmployeeWage(String company, int empRatePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        System.out.println("\nCalculating wages for company: " + company);

        while (totalDaysWorked < maxWorkingDays && totalHoursWorked < maxWorkingHours) {
            totalDaysWorked++;
            int dailyHoursWorked = (Math.random() > 0.5) ? 8 : 4; // Randomly choose between full-time (8 hrs) or part-time (4 hrs)
            totalHoursWorked += dailyHoursWorked;

            // If total hours exceed max hours, adjust it
            if (totalHoursWorked > maxWorkingHours) {
                dailyHoursWorked -= (totalHoursWorked - maxWorkingHours);
                totalHoursWorked = maxWorkingHours;
            }

            int dailyWage = dailyHoursWorked * empRatePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalDaysWorked + ": Worked " + dailyHoursWorked + " hours, Daily Wage = $" + dailyWage);
        }

        System.out.println("Total Wage for " + company + ": $" + totalWage);
    }
}
