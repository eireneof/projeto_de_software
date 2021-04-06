package src;

public class Timecard {
    private String employeeId;
    private String entry;
    private String exit;

    public Timecard(String employeeId, String entry, String exit) {
        this.employeeId = employeeId;
        this.entry = entry;
        this.exit = exit;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setEntry(String entry) {
        this.entry = entry;
    }
    public void setExit(String exit) {
        this.exit = exit;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getEntry() {
        return entry;
    }
    public String getExit() {
        return exit;
    }
}
