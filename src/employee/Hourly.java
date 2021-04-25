package employee;

import java.util.ArrayList;
import itens.TimeCard;

public class Hourly extends Employee {
	
	private double hourSalary;

    private ArrayList<TimeCard> timeCards = new ArrayList<TimeCard>();

    public Hourly(String name, String adress, int id, String paymentMethod, double hourSalary) {
        super(name, adress,id, paymentMethod);
        this.setHourSalary(hourSalary);   
    }
    
    public int coutingHours() {
    	int count = 0;
    	for(TimeCard j : timeCards ) {
    		System.out.println("Data:" + j.date + "\n Horas trabalhadas:" + j.workedHours + "\n \n");
    		count += j.workedHours;
    	}
    	
    	System.out.println("Total de horas trabalahar por " + this.name + "( " + this.id + " ) foi de: " + count + " horas");
    	
    	return count;
    }
    
    /*public double coutingSalary() {
    	int count = 0;
    	for(TimeCard j : timeCards ) {
    		System.out.println("Data:" + j.date + "\n Horas trabalhadas:" + j.workedHours + "\n \n");
    		count += j.workedHours;
    	}
    	
    	System.out.println("Total de horas trabalahar por " + this.name + "( " + this.id + " ) foi de: " + count + " horas");
    	
    	return count;
    } */
    
    /*public double countingSalary() {
    	return this.hourSalary * this.coutingHours();
    } */
    
    public void postTimeCard(double in, double out, String date) {
    	TimeCard timeCard = new TimeCard(in, out, date);
    	this.timeCards.add(timeCard);
    }
    //private ArrayList<TimeCard>
    
    public String showEmployee() {
    	return "Nome do empregado: " + this.name + 
    			"\nEndereco: " + this.adress +
    			"\nID: " + this.id + 
    			"\nMétodo de Pagamento: " + this.paymentMethod;
    }

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}
    
    //quanto ele vai receber
    //zerar o cartão de ponto 
    //update salário horário
}
