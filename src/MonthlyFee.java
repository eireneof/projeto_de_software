package src;

public class MonthlyFee extends Taxes{
    private double value;

    public MonthlyFee(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    
}
