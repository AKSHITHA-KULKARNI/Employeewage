public class MonthlyWages {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int WORKING_DAYS_PER_MONTH = 20;

    public int calculateMonthlyWage() {
        return WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;
    }
}
