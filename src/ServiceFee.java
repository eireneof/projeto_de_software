package src;

public class ServiceFee extends Taxes{
    private String feeId;
    private double value;

    public ServiceFee(String feeId, double value) {
        this.feeId = feeId;
        this.value = value;
    }
    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }
    public String getFeeId() {
        return feeId;
    }
}
