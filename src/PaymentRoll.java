package src;

public class PaymentRoll {
    private String employeeId;
    private String date;

    public PaymentRoll(String employeeId, String date) {
        this.employeeId = employeeId;
        this.date = date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getDate() {
        return date;
    }
    public String getEmployeeId() {
        return employeeId;
    }
}
