public class EmployeeWageWithSwitch {
    private static final int WAGE_PER_HOUR = 20;

    public int calculateWageUsingSwitch(int hoursWorked) {
        return switch (hoursWorked) {
            case 8 -> WAGE_PER_HOUR * 8;  // Full-time wage
            case 4 -> WAGE_PER_HOUR * 4;  // Part-time wage
            default -> 0;                 // No wage
        };
    }
}
