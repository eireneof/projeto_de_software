package src;

import java.util.Set;

public class Paycheck {
    private String employeeId;
    private double salary;
    private String taxes;

    public Paycheck( String employeeId, double salary, String taxes) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.taxes = taxes;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public String getTaxes() {
        return taxes;
    }
}
