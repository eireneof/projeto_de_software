package sells;

public class Sale {
	private String date;
	private double value;
	private String item;
	private int employeeId;
	//public int id;
	

	public Sale(String date, double value, String item, int employeeId) {
		this.setDate(date);
        this.setValue(value);
        this.setItem(item);
        this.setEmployeeId(employeeId);
	}
	
    public String showSale(Sale sale) {
    	return "Produto: " + sale.getItem() +
    			"\nValor: " + sale.getValue() +
    			"\n Data: " + sale.getDate();
     }

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
