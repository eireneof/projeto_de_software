package src;

public class NormalRates extends Taxes{
    private double value;

    public NormalRates(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    
}
