public class EmployeeDailyWage {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public int calculateDailyWage() {
        return WAGE_PER_HOUR * FULL_DAY_HOUR;
    }
}
