package employee;

import java.util.ArrayList;

import java.util.Scanner;

import sells.Sale;

public class Comissioned extends Salaried{
	
	private double comission;
	private static ArrayList<Sale> salesList = new ArrayList<Sale>();
	private double acumulatedComission;

	public Comissioned(String name, String adress, int id, String paymentMethod, double salary, double comission, int sindicate) {
		super(name, adress, id, paymentMethod, salary, sindicate);
		this.comission = comission;
		this.setAcumulatedComission(0);
	}
	
    /*public void setSell(String date, double value, String item, int id) {
    	Sale sale = new Sale(date, value, item, id);
        this.sale.add(sale);
    }*/
    
    public double getComission() {
        return this.comission;
    }
    
    public void setComission(double comission) {
        this.comission = comission;
    }
    

    
    public void postSale(int employeeId) {
    	 Scanner in = new Scanner(System.in);

         System.out.println("Informe a data da venda:");
         System.out.println("Utilize o formato dia/mês/ano");
         String date = in.nextLine();

         System.out.println("Informe o nome do produto:");
         String itemName = in.nextLine();

         System.out.println("Informe o valor do produto:");
         double value = in.nextDouble();
         
         //System.out.println("Informe o valor do produto:");
         //double value = in.nextDouble();
         
         this.setAcumulatedComission(this.getAcumulatedComission() + (this.comission * value));
         
         //String date, double value, String item

         Sale sale = new Sale(date, value, itemName, employeeId);
         salesList.add(sale);
         
         System.out.println("Produto adicionado!");
         System.out.println(salesList.get(salesList.size() - 1).showSale(salesList.get(salesList.size() - 1)));

         /*for(Sale saleAux : salesList){
             System.out.println("Produto adicionado: " + saleAux.getItem());
         } */
     }

	public double getAcumulatedComission() {
		return acumulatedComission;
	}

	public void setAcumulatedComission(double acumulatedComission) {
		this.acumulatedComission = acumulatedComission;
	}
    
    /*public String showEmployeeInfo() {
        return "Nome: " + this.name 
        		+ "\nEndereco: " + this.adress 
        		+"\nNumero do cartao: " + this.id 
        		+ "\nMetodo de Pagamento: " + this.paymentMethod;
    } */
    
    

}
