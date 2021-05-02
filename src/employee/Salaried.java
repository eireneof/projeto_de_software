package employee;

public class Salaried extends Employee{
	
	private double salary;
	//private ArrayList<Sale> sale = new ArrayList<Sale>();
	
	public Salaried(String name, String adress, int id, String paymentMethod, double salary, int sindicate) {
        super(name, adress, id, paymentMethod, sindicate);
        this.salary = salary;
    }
	
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    /*public String showEmployeeInfo() {
        return "Nome: " + this.name + 
        		"\nEndereco: " + this.adress +
        		"\nNumero do cartao: " + this.id + 
        		"\nMetodo de Pagamento: " + this.paymentMethod;
    }*/
}
