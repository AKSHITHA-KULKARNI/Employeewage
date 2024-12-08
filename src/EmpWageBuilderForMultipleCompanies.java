import java.util.ArrayList;

public class EmpWageBuilderForMultipleCompanies {
    private ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilderForMultipleCompanies() {
        companies = new ArrayList<>();
    }

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public void computeWageForAllCompanies() {
        for (CompanyEmpWage company : companies) {
            EmpWageBuilder wageBuilder = new EmpWageBuilder(company.getCompanyName(),
                    company.getEmpRatePerHour(), company.getMaxWorkingDays(), company.getMaxWorkingHours());
            wageBuilder.computeEmployeeWage();
        }
    }
}
