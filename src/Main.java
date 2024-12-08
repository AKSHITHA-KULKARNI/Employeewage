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
    }
}