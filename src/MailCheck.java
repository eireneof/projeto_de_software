package src;

public class MailCheck {
    double value;
    String employeeAdress;
    String  recipient;
    String sender;
    double postageFee;

    public MailCheck(double value, String employeeAdress, String  recipient, String sender, double postageFee) {
        this.value = value;
        this.employeeAdress = employeeAdress;
        this.recipient = recipient;
        this.sender = sender;
        this.postageFee = postageFee;
    }
}
