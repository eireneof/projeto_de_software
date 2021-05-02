package sells;

public class Sale {
	private String date;
	private double value;
	private String item;
	//public int id;
	

	public Sale(String date, double value, String item) {
		this.setDate(date);
        this.setValue(value);
        this.setItem(item);
        //this.id = id;
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

}
