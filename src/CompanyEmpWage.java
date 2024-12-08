public class CompanyEmpWage {
    private String companyName;
    private int empRatePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    public CompanyEmpWage(String companyName, int empRatePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }
}
