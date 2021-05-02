package employee;

import java.util.ArrayList;
import java.util.Random;
//import employee.Employee;
import java.util.Scanner;

public class Sindicate {
	private String name;
	private int employeeId;
	private int sindicateId;
	private double feeMonthly;
	private double feeService;
	private static ArrayList<Sindicate> listSindicate = new ArrayList<Sindicate>();

	public Sindicate(String name, int employeeId, int sindicateId, double feeMonthly, double feeService) {
		this.setName(name);
		this.setFeeMonthly(feeMonthly);
		this.setFeeService(feeService);
		this.setSindicateId(sindicateId);
	}
	
	public Sindicate() {
		//return null;
	}
	
	
    public int idGenerate() {
    	Random random = new Random();
    	int id = random.nextInt(1000) + random.nextInt(35) + random.nextInt(849);
    	int size = listSindicate.size();
    	for(int i = 0; i < size; i++) {
    		if(id == listSindicate.get(i).getSindicateId()) {
    			id = random.nextInt(1000) + random.nextInt(35) + random.nextInt(849);
    			i = 0;
    		}
    	}
    	return id;
    }
	
	public String showSindicateMember(Sindicate member) {
		return "Nome do Membro: " + member.name +
				"\n ID do Menbro: " + member.sindicateId;
	}
	
	public void addSindicateMember(String name, int employeeId) { 
		//Random randInt = new Random();
		int id = idGenerate();
		Sindicate member = new Sindicate(name, employeeId, id, 0, 0);
		listSindicate.add(member);
		System.out.println(listSindicate.get(listSindicate.size() - 1).showSindicateMember(member));
		System.out.println("Adição no sindicato realizada com sucesso!");
	}
	
    public void removeSindicateMember(int id) {
    	System.out.println("Verificando se o empregado é membro do sindicato para realizar a remoção...");
    	
    	Sindicate nullMember = null;
    	for(Sindicate sindicate : listSindicate){
            if(sindicate.getEmployeeId() == id){
            	nullMember = sindicate;
            }
        }
    	listSindicate.remove(nullMember);
    	System.out.println("Removido do sindicato!");
    }
    
    public void postFeeService() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Qual o ID do membro do sindicato?");
        int id = in.nextInt();
        for(Sindicate member : listSindicate){
            if(member.getSindicateId() == id){
                System.out.println("Qual é o valor da taxa?");
                double feeService = in.nextDouble();
                member.setFeeService(feeService);
            }
        }
    }
    
    public void changeMember() {
    	Scanner in = new Scanner(System.in);
    	int employeeId, memberId;
    	
    	System.out.println("O que será modificado?");
    	System.out.println("1 - Adição de membro ao sindicato");
    	System.out.println("2 - Remoção de membro ao sindicato");
    	System.out.println("3 - Alteração da taxa sindical");
    	System.out.println("4 - Alteração do ID de membro");
    	
    	int command = in.nextInt();
    	
    	switch(command) {
    		case 1:
    			System.out.println("Informe o nome do empregado:");
    			String name = in.nextLine();
    			System.out.println("Informe o ID do empregado");
    			employeeId = in.nextInt();
    			addSindicateMember(name, employeeId);
    			break;
    		case 2:
    			System.out.println("Informe o ID do empregado");
    			employeeId = in.nextInt();
    			removeSindicateMember(employeeId);
    			break;
    		case 3:
    			System.out.println("Informe o ID do membro do sindicato");
    			memberId = in.nextInt();
    	        for(Sindicate member : listSindicate){
    	            if(member.getSindicateId() == memberId){
    	                System.out.println("Qual é o valor da taxa?");
    	                double feeService = in.nextDouble();
    	                member.setFeeMonthly(feeService);
    	            }
    	        }
    			break;
    		case 4:
    			System.out.println("Informe o ID do membro do sindicato");
    			memberId = in.nextInt();
    	        for(Sindicate member : listSindicate){
    	            if(member.getSindicateId() == memberId){
    	                member.setSindicateId(idGenerate());
    	            }
    	        }
    			break;
    	}

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

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
