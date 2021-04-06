package src;

public class Employee {
   private String name;
   private String adress;
   private String employeeId;
   private String paymentMethod;

    public void initEmployee(String name, String adress, String employeeId, String paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.employeeId = employeeId;
        this.paymentMethod = paymentMethod;
    }

    public String printEmployeeInfo() {
        return "Name " + this.name + 
                "\nAdress: " + this.adress +
                "\nEmployee ID: " + this.employeeId + 
                "\nMetodo de Pagamento: " + this.paymentMethod;
    }

    public void definePaymentMethod(String method) {
        if (method.equals("hand check") || method.equals("deposit") || method.equals("mail check")) {
            this.paymentMethod = method;
        } else {
            System.out.println("Invalid payment method!\n");
        }
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getAdress() {
        return adress;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

}