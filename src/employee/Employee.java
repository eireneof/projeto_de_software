package employee;

import java.util.Random;
import java.util.Scanner;

//import jdk.internal.util.xml.impl.Input;

public class Employee {
    //além do próprio arquivo, só quem tá na mesma pasta tem acesso
    protected String name;
    protected String adress;
    //protected String type;   
    protected int id;
    protected String paymentMethod;
    private static Employee employeeArray[]; //fixa para todos os empregados

    public Employee(int numberOfEmployees) {
        Employee.employeeArray = new Employee[numberOfEmployees];
    }

    public Employee(String name, String adress, int id, String paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.paymentMethod = paymentMethod;
    }
    
    public Employee(String name, String adress, int id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        //this.paymentMethod = paymentMethod;
    }

    public void idGenerate() {
        Random randInt = new Random();
        this.id = randInt.nextInt(1000);
    }

    public void add() {
        Random randInt = new Random();
        Scanner in = new Scanner(System.in); //sysin = pegar do terminal

        System.out.println("Digite o nome do empregado:");
        String name = in.nextLine();

        System.out.println("Digite o endereço do empregado:");
        String adress = in.nextLine();

        System.out.println("Digite e método de pagamento do empregado:");
        System.out.println("Opções: horista, salariado ou comissionado");
        String paymentMethod = in.nextLine();

        //gerando a id do empregado
        int id = randInt.nextInt(1000);
        while(employeeArray[id] != null) 
            id = randInt.nextInt();

        System.out.println("Digite o tipo de empregado: ");
        System.out.println("Opções: assalariado, horista ou comissionado.");
        //int flag = 0;
        String type = in.nextLine();
        
        double salary;
        
        //Employee employee = new Employee(name, adress, id,paymentMethod);

        if(type.equals("assalariado")) {
        	System.out.println("Informe o salário:");
        	salary = in.nextDouble();
            employeeArray[id] = new Salaried(name, adress, id, paymentMethod, salary);
        } else if (type.equals("horista")) {
        	System.out.println("Informe o salário horário:");
        	salary = in.nextDouble();
            employeeArray[id] = new Hourly(name, adress, id, paymentMethod, salary);
        } else {
        	System.out.println("Informe a porcentagem de comissão:");
        	double percent = in.nextDouble();
        	System.out.println("Informe o salário:");
        	salary = in.nextDouble();
            employeeArray[id] = new Comissioned(name, adress, id, paymentMethod, salary, percent);
        }
        
        System.out.println("O empregado fará parte do sindicato?");
        String sindicate = in.nextLine();
        if(sindicate.equals("sim")) {
        	
        } else {
        	
        }
        in.close();
        System.out.println("Adição finalizada com sucesso!");
        System.out.println(employeeArray[id].toString());   
    }
    
}
