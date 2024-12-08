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

        // UC9: Save Total Wage for Each Company
        EmpWageBuilder companyA = new EmpWageBuilder("CompanyA", 20, 20, 100);
        companyA.computeEmployeeWage();

        // UC10: Manage Employee Wage of Multiple Companies
        EmpWageBuilderForMultipleCompanies multiCompanyWage = new EmpWageBuilderForMultipleCompanies();
        multiCompanyWage.addCompany(new CompanyEmpWage("CompanyA", 20, 20, 100));
        multiCompanyWage.addCompany(new CompanyEmpWage("CompanyB", 25, 22, 120));
        multiCompanyWage.computeWageForAllCompanies();

        // UC11: Using Interface Approach
        EmpWageBuilderUsingInterface companyBInterface = new EmpWageBuilderUsingInterface("CompanyB", 25, 22, 120);
        companyBInterface.computeEmployeeWage();

        // UC12: Refactor to List of Companies
        EmpWageBuilderList wageList = new EmpWageBuilderList();
        wageList.addWageBuilder(new EmpWageBuilder("CompanyA", 20, 20, 100));
        wageList.addWageBuilder(new EmpWageBuilder("CompanyB", 25, 22, 120));
        wageList.computeWagesForAll();

        // UC13: Get Total Wage When Queried
        EmpWageBuilderWithQuery companyCQuery = new EmpWageBuilderWithQuery("CompanyC", 30, 20, 100);
        companyCQuery.computeEmployeeWage();
        System.out.println("Total Wage for CompanyC: $" + companyCQuery.getTotalWage());
    }
}