package employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import employee.Sindicate;


public class Employee {
	private String name;
    private String adress;  
    private int id;
    private String paymentMethod;
    //private static Employee employeeArray[];
    private ArrayList<Employee> listEmployees = new ArrayList<Employee>();
    private int sindicate;

    /*public Employee(int numberOfEmployees) {
        Employee.employeeArray = new Employee[numberOfEmployees];
        
    }*/
    
    public String getAdress(){
        return adress;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPaymentMethod(){
        return paymentMethod;
    }
    
    public int getSindicate(){
        return sindicate;
    }
        
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPaymentMethod(String paymentMethod) {
    	this.paymentMethod = paymentMethod;
    }
    
    
    
    public Employee(){
    	
    }

    public Employee(String name, String adress, int id, String paymentMethod, int sindicate) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.sindicate = sindicate;
    }
    
    public Employee(String name, String adress, int id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public int idGenerate() {
    	Random random = new Random();
    	int id = random.nextInt(1000) + random.nextInt(35) + random.nextInt(849);
    	int size = listEmployees.size();
    	for(int i = 0; i < size; i++) {
    		if(id == listEmployees.get(i).getId()) {
    			id = random.nextInt(1000) + random.nextInt(35) + random.nextInt(849);
    			i = 0;
    		}
    	}
    	return id;
    }
    
    public String showEmployeeInfo(Employee employee) {
    	return "Nome do empregado: " + employee.name + 
    			"\nEndereco: " + this.adress +
    			"\nID: " + employee.id + 
    			"\nM�todo de Pagamento: " + employee.paymentMethod;
    }

    public void add() {
        Scanner in = new Scanner(System.in); //sysin = pegar do terminal

        System.out.println("Digite o nome do empregado:");
        String name = in.nextLine();

        System.out.println("Digite o endere�o do empregado:");
        String adress = in.nextLine();

        System.out.println("Digite e m�todo de pagamento do empregado:");
        System.out.println("Op��es: cheque, deposito ou correios");
        String paymentMethod = in.nextLine();

        int id = idGenerate();

        System.out.println("Digite o tipo de empregado: ");
        System.out.println("Op��es: assalariado, horista ou comissionado.");
        String type = in.nextLine();
        
        double salary;
             
        if(type.equals("assalariado")) {
        	System.out.println("Informe o sal�rio:");
        	salary = in.nextDouble();
        	Salaried salaried =  new Salaried(name, adress, id, paymentMethod, salary, sindicate);
        	listEmployees.add(salaried);
        } else if (type.equals("horista")) {
        	System.out.println("Informe o sal�rio hor�rio:");
        	salary = in.nextDouble();
        	Hourly hourly = new Hourly(name, adress, id, paymentMethod, salary, sindicate);
        	listEmployees.add(hourly);
        } else {
        	System.out.println("Informe a porcentagem de comiss�o:");
        	double percent = in.nextDouble();
        	System.out.println("Informe o sal�rio:");
        	salary = in.nextDouble();
        	Comissioned comissioned = new Comissioned(name, adress, id, paymentMethod, salary, percent, sindicate);
        	listEmployees.add(comissioned);
        } 
        
        System.out.println("O empregado far� parte do sindicato?");
        System.out.println(" 1 - sim");
        System.out.println(" 0 - n�o");
        int sindicate = in.nextInt();
       
        if(sindicate == 1) {
        	Sindicate sindicateMember = new Sindicate();
        	sindicateMember.addSindicateMember(name, id);
        }
        
        System.out.println(listEmployees.get(listEmployees.size() - 1).showEmployeeInfo(listEmployees.get(listEmployees.size() - 1)));
        System.out.println("Adi��o finalizada com sucesso!");        
    }
    
    public void removeEmployee() {
    	System.out.println("Qual � o id do empregado a ser removido?");
    	Scanner in = new Scanner(System.in);
    	int id = in.nextInt();
    	
    	Sindicate sindicateMember = new Sindicate();
    	sindicateMember.removeSindicateMember(id);
    	
    	Employee nullEmployee = null;
    	for(Employee employee : listEmployees){
            if(employee.getId() == id){
            	nullEmployee = employee;
            }
        }
    	listEmployees.remove(nullEmployee);
    	System.out.println("Removido dos empregados!");
    	
    	System.out.println("Rol atual de empregados: ");
        for (Employee activesEmployees : listEmployees) {
            System.out.println(activesEmployees.getName());
        }
    } 
    
    public String getName() {
    	return name;
    }
    
    public void postTimeCard() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Qual o ID do empregado?");
    	int id = in.nextInt();
        for(Employee employee : listEmployees){
            if(employee.getId() == id){
                if(employee.getClass() == Hourly.class){
                    ((Hourly)employee).postTimeCard();
                }
            }
        }
    	System.out.println("Cart�o de ponto lan�ado!");	
    }
    
    public void postSale() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Qual o ID do empregado?");
    	int id = in.nextInt();
    	
        for(Employee employee : listEmployees){
            if(employee.getId() == id){
                if(employee.getClass() == Comissioned.class){
                    ((Comissioned)employee).postSale();
                }
            }
        }
        System.out.println("Venda Cadastrada!");	    	
    }
    
    public void employeeChange() {
        System.out.println("O que ser� modificado modificar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Endere�o");
        System.out.println("3 - Tipo(Horista/Comissionado/Assalariado)");
        System.out.println("4 - M�todo de pagamento");
        
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        
        System.out.println("Informe o ID do empregado:");
        int id = in.nextInt();
        
        switch(command) {
        	case 1:
        		System.out.println("Informe o novo nome:");
                String name = in.next();
                for(Employee employee : listEmployees){
                    if(employee.getId() == id){
                        employee.setName(name);
                        System.out.println("Novo nome adicionado com sucesso!");
                        employee.showEmployeeInfo(employee);
                    }
                }
        		break;
        	case 2:
        		System.out.println("Informe o novo endere�o:");
        		String adress = in.next();
        		for(Employee employee : listEmployees){
                    if(employee.getId() == id){
                        employee.setName(adress);
                        System.out.println("Novo endere�o adicionado com sucesso!");
                        employee.showEmployeeInfo(employee);
                    }
                }
        		break;
        	case 3:
        		for(Employee employee : listEmployees){
                    if(employee.getId() == id){
                        System.out.println("Informe o novo tipo de empregado:");
                        System.out.println("Op��es: assalariado, horista ou comissionado.");
                        String type = in.nextLine();
                        Employee auxEmployee = employee;
                        listEmployees.remove(employee);
                        if(type.equals("horista")){
                        	System.out.println("Informe o sal�rio hor�rio do novo horista:");
                        	double hourSalary = in.nextDouble();
                            Hourly hourly = new Hourly(auxEmployee.getName(), auxEmployee.getAdress(),auxEmployee.getId(), auxEmployee.getPaymentMethod(), hourSalary,  auxEmployee.getSindicate());
                            listEmployees.add(hourly);
                        } else if (type.equals("comissionado")) {
                            double percent, salary;
                            System.out.println("Informe o sal�rio do novo comissionado:");
                            salary = in.nextDouble();
                            System.out.println("Informe o percentual de venda do novo comissionado:");
                            percent = in.nextDouble();
                            Comissioned commissioned = new Comissioned(auxEmployee.getName(), auxEmployee.getAdress(),auxEmployee.getId(), auxEmployee.getPaymentMethod(), salary, percent,  auxEmployee.getSindicate());
                            listEmployees.add(commissioned);
                        } else if(type.equals("assalariado")) {
                        	System.out.println("Informe o sal�rio do novo assalariado:");
                            double salary = in.nextDouble();
                            Salaried salaried = new Salaried(auxEmployee.getName(), auxEmployee.getAdress(),auxEmployee.getId(), auxEmployee.getPaymentMethod(), salary,  auxEmployee.getSindicate());
                            listEmployees.add(salaried);
                        } else {
                        	System.out.println("Tipo inv�lido!");
                        }
                    }
                }
        		break;
        	case 4:
        		for(Employee employee : listEmployees){
                    if(employee.getId() == id){
                        System.out.println("Informe o novo m�todo de pagamento:");
                        System.out.println("Op��es: cheque, deposito ou correios");
                        String method = in.nextLine();
                        if(method.equals("cheque") || method.equals("deposito") || method.equals("correios")) {
                        	employee.setPaymentMethod(method);
                        } else {
                        	System.out.println("Tipo inv�lido!");
                        }  
                    }
        		}
        		break;
        		
        
        //public Salaried(String name, String adress, int id, String paymentMethod, double salary, int sindicate)
        }
    }
}


