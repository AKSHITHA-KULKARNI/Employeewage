public class EmpWageBuilderUsingInterface implements IEmployeeWage {
    private String companyName;
    private int empRatePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    public EmpWageBuilderUsingInterface(String companyName, int empRatePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
    }

    @Override
    public void computeEmployeeWage() {
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        while (totalDaysWorked < maxWorkingDays && totalHoursWorked < maxWorkingHours) {
            totalDaysWorked++;
            int dailyHoursWorked = (Math.random() > 0.5) ? 8 : 4;
            totalHoursWorked += dailyHoursWorked;

            if (totalHoursWorked > maxWorkingHours) {
                dailyHoursWorked -= (totalHoursWorked - maxWorkingHours);
                totalHoursWorked = maxWorkingHours;
            }

            int dailyWage = dailyHoursWorked * empRatePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalDaysWorked + ": Worked " + dailyHoursWorked + " hours, Daily Wage = $" + dailyWage);
        }

        System.out.println("Total Wage for " + companyName + ": $" + totalWage);
    }
}
