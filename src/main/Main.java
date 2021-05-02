package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Stack;

import employee.Employee;
import employee.Sindicate;

public class Main {
    public static void main(String[] args){
        System.out.println("Ol�, seja bem vindo (a) ao Sistema de Folha de Pagamento");
        System.out.println("Qual dos comandos a seguir voc� deseja executar?");

        System.out.println("1 - Adi��o de Empregado");
        System.out.println("2 - Remo��o de Empregado");
        System.out.println("3 - Lan�ar um cart�o de ponto");
        System.out.println("4 - Lan�ar um  resultado de venda");
        System.out.println("5 - Lan�ar uma taxa de servi�o");
        System.out.println("6 - Alterar detalhes de um empregado");
        System.out.println("7 - Rodar folha de pagamento para hoje");
        System.out.println("8 - Undo/Redo");
        System.out.println("9 - Agenda de Pagamento");
        System.out.println("10 - Cria��o de novas agendas de pagamento");
        System.out.println("11 - Sair");
        System.out.println("0 - Mostrar a lista de comandos");
        Scanner scanner = new Scanner(System.in);
        
        int comando = 1;
        do {
        	
        	comando = scanner.nextInt();
        	int option;
        	Sindicate sindicate = new Sindicate();
            Employee employee = new Employee();
            switch(comando) {
                case 1:
                    System.out.println("Adi��o de um empregado");
                    employee.add();
                    break;
                case 2:
                	System.out.println("Remo��o de um empregado");
                	employee.removeEmployee();
                	
                	break;
                case 3:
                	System.out.println("Lan�ar um cart�o de ponto");
                	employee.postTimeCard();
                	break;
                case 4:
                	System.out.println("Lan�ar uma venda!");
                	employee.postSale();
                	break;
                case 5:
                	System.out.println("Lan�ar uma taxa de servi�o!");
                	//employee.postSale();
                	break;
                case 6: 
                	System.out.println("Alterar detalhes de um empregado!");
                	System.out.println("Esses dados s�o referentes a:");
                	System.out.println("1 - Informa��es do empregado na EMPRESA");
                	System.out.println("2 - Informa��es do empregado na SINDICATO");
                	option = scanner.nextInt();
                	if(option == 1)
                		employee.employeeChange();
                	else if(option == 2)
                		sindicate.changeMember();
                case 7:
                	System.out.println("Rodar folha de pagamento para hoje!");
                	break;
                case 8:
                	System.out.println("Undo/Redo!");
                	System.out.println("Das a��es de 1 - 7 qual ser� mudada?");
                	option = scanner.nextInt();
                	if(option == 1) {
                		
                	} else if(option == 2) {
                		
                	} else if(option == 3) {
                		
                	} else if(option == 4) {
                		
                	} else if(option == 5) {
                		
                	} else if(option == 6) {
                		
                	} else {
                		System.out.println("Op��o inv�lida!");
                	}
                	break;
            }
            

            System.out.println("Informe um novo comando, digite 11 para sair ou 0 para mostrar a lista de comandos.");
            //int newcomando = scanner.nextInt();
            //comando = newcomando;
        } while(comando != 11);
        scanner.close();
        
        System.out.println("Voc� saiu do sistema. At� breve!");

        
    }
}

