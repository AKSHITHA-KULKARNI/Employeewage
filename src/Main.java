public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1: Check Employee Attendance
        EmployeeAttendance attendance = new EmployeeAttendance();
        boolean isPresent = attendance.isEmployeePresent();
        System.out.println("Employee is " + (isPresent ? "Present" : "Absent"));

        // UC2: Calculate Daily Wage
        EmployeeDailyWage dailyWage = new EmployeeDailyWage();
        System.out.println("Daily Wage: $" + dailyWage.calculateDailyWage());

        // UC3: Calculate Part-Time Wage
        EmployeePartTimeWage partTimeWage = new EmployeePartTimeWage();
        System.out.println("Part-Time Wage: $" + partTimeWage.calculatePartTimeWage());

        // UC4: Switch Case Wage Computation
        EmployeeWageWithSwitch switchWage = new EmployeeWageWithSwitch();
        System.out.println("Full-Time Wage using Switch: $" + switchWage.calculateWageUsingSwitch(8));
        System.out.println("Part-Time Wage using Switch: $" + switchWage.calculateWageUsingSwitch(4));

        // UC5: Calculate Wages for a Month
        MonthlyWages monthlyWages = new MonthlyWages();
        System.out.println("Monthly Wage: $" + monthlyWages.calculateMonthlyWage());

        // UC6: Total Wages with Hour/Day Conditions
        TotalWages totalWages = new TotalWages();
        System.out.println("Total Wage (max 100 hours or 20 days): $" + totalWages.calculateTotalWage());

        //UC7
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.computeEmployeeWage();

        // UC8: Compute Employee Wage for Multiple Companies
        EmployeeWageForCompanies.computeEmployeeWage("CompanyA", 20, 20, 100);
        EmployeeWageForCompanies.computeEmployeeWage("CompanyB", 25, 22, 120);
    }
}