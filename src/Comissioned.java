package src;

public class Comissioned extends Employee{
    private double sales;

    public Comissioned(double sales) {
        this.sales = sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }
}
