package src;

public class Salary {
    private String employeeId;
    private double grossSalary;
    private double netSalary;
    private double ratesAndTaxes;

    public Salary(String employeeId, double grossSalary, double netSalary, double ratesAndTaxes) {
        this.employeeId = employeeId;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
        this.ratesAndTaxes = ratesAndTaxes;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    public void setRatesAndTaxes(double ratesAndTaxes) {
        this.ratesAndTaxes = ratesAndTaxes;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public double getNetSalary() {
        return netSalary;
    }
    public double getRatesAndTaxes() {
        return ratesAndTaxes;
    }
}
