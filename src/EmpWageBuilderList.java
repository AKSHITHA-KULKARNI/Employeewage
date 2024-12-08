import java.util.ArrayList;

public class EmpWageBuilderList {
    private ArrayList<EmpWageBuilder> wageBuilders;

    public EmpWageBuilderList() {
        wageBuilders = new ArrayList<>();
    }

    public void addWageBuilder(EmpWageBuilder wageBuilder) {
        wageBuilders.add(wageBuilder);
    }

    public void computeWagesForAll() {
        for (EmpWageBuilder wageBuilder : wageBuilders) {
            wageBuilder.computeEmployeeWage();
        }
    }
}
