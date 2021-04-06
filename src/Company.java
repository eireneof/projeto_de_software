package src;

public class Company {
    private String companyName;
    private int numberOfEmployees;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    
}
