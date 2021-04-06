package src;

public class Hourly extends Employee {
    private int workedHours;
    public Hourly (int workedHours) {
        this.workedHours = workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }
}
