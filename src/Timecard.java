package src;

public class Timecard {
    String employeeId;
    String entry;
    String exit;

    public Timecard(String employeeId, String entry, String exit) {
        this.employeeId = employeeId;
        this.entry = entry;
        this.exit = exit;
    }
}
