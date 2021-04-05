package src;

public class Salary {
    String employeeId;
    double grossSalary;
    double netSalary;
    double ratesAndTaxes;

    public Salary(String employeeId, double grossSalary, double netSalary, double ratesAndTaxes) {
        this.employeeId = employeeId;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.ratesAndTaxes = ratesAndTaxes;
    }
}
