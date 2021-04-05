package src;

public class Deposit {
    double value;
    String employeeName;
    String bankNumber;
    String agency;
    String employeeId;

    public Deposit(double value, String employeeName, String bankNumber, String agency, String employeeId) {
        this.value = value;
        this.employeeName = employeeName;
        this.bankNumber = bankNumber;
        this.agency = agency;
        this.employeeId = employeeId;
    }
}
