package src;

public class Paycheck {
    String employeeId;
    double salary;
    String taxes;

    public Paycheck( String employeeId, double salary, String taxes) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.taxes = taxes;
    }
}
