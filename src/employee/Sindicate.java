package employee;

public class Sindicate extends Employee{
	private int sindicateId;
	private double feeMonthly;
	private double feeService;

	public Sindicate(String name, String adress, int id, int sindicateId, double feeMonthly, double feeService) {
		super(name, adress, id);
		this.setFeeMonthly(feeMonthly);
		this.setFeeService(feeService);
		this.setSindicateId(sindicateId);
	}
	
    public String showEmployeeInfo() {
        return "Nome: " + this.name + 
        		"\nEndereco: " + this.adress 
        		+"\nNumero do cartao: " + this.id;
    }

	public int getSindicateId() {
		return sindicateId;
	}

	public void setSindicateId(int sindicateId) {
		this.sindicateId = sindicateId;
	}

	public double getFeeMonthly() {
		return feeMonthly;
	}

	public void setFeeMonthly(double feeMonthly) {
		this.feeMonthly = feeMonthly;
	}

	public double getFeeService() {
		return feeService;
	}

	public void setFeeService(double feeService) {
		this.feeService = feeService;
	}
}
