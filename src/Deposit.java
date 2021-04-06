package src;

import java.util.Set;

public class Deposit extends PaymentMethods{
    
    private String bankNumber;
    private String agency;

    public void initDeposit(String bankNumber, String agency) {
        this.bankNumber = bankNumber;
        this.agency = agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAgency() {
        return agency;
    }
    
    public String getBankNumber() {
        return bankNumber;
    }
}
