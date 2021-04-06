package src;

public class MailCheck extends PaymentMethods{
    String employeeAdress;
    String  recipient;
    String sender;
    double postageFee;

    public MailCheck(String employeeAdress, String  recipient, String sender, double postageFee) {
        this.employeeAdress = employeeAdress;
        this.recipient = recipient;
        this.sender = sender;
        this.postageFee = postageFee;
    }

    public void setEmployeeAdress(String employeeAdress) {
        this.employeeAdress = employeeAdress;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setPostageFee(double postageFee) {
        this.postageFee = postageFee;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getEmployeeAdress() {
        return employeeAdress;
    }
    public double getPostageFee() {
        return postageFee;
    }
    public String getRecipient() {
        return recipient;
    }
    public String getSender() {
        return sender;
    }
}
