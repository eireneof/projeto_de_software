package employee;

import java.util.ArrayList;

import sells.Sale;

public class Comissioned extends Salaried{
	
	private double comission;
	private ArrayList<Sale> sale = new ArrayList<Sale>();

	public Comissioned(String name, String adress, int id, String paymentMethod, double salary, double comission) {
		super(name, adress, id, paymentMethod, salary);
		this.comission = comission;
	}
	
    public void setSell(String date, double value, String item, int id) {
    	Sale sale = new Sale(date, value, item, id);
        this.sale.add(sale);
    }
    
    public double getComission() {
        return this.comission;
    }
    
    public void setComission(double comission) {
        this.comission = comission;
    }
    
    public String showEmployeeInfo() {
        return "Nome: " + this.name 
        		+ "\nEndereco: " + this.adress 
        		+"\nNumero do cartao: " + this.id 
        		+ "\nMetodo de Pagamento: " + this.paymentMethod;
    }
    
    

}
