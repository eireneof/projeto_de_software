package sells;

public class Sale {
	public String date;
	public double value;
	public String item;
	public int id;
	

	public Sale(String date, double value, String item, int id) {
		this.date = date;
        this.value = value;
        this.item = item;
        this.id = id;
	}

}
