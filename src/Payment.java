package src;

public class Payment {
    private double value;
    private String employeeId;
    private String date;

    public Payment(double value, String employeeId, String date) {
        this.value = value;
        this.employeeId = employeeId;
        this.date = date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String getDate() {
        return date;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public double getValue() {
        return value;
    }
}
