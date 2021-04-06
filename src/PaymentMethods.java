package src;

public class PaymentMethods {
    private String employeeName;
    private String employeeId;
    private String method;

    public void initPaymentMethods(String employeeId, String method) {
        this.employeeId = employeeId;
        this.method = method;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getMethod() {
        return method;
    }
}
