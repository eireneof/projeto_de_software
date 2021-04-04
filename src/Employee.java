package src;

public class Employee {
   String name;
   String adress;
   String employeeId;
   String paymentMethod;

    public Employee(String name, String adress, String employeeId, String paymentMethod) {
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

}