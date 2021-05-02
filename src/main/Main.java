package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Stack;

import employee.Employee;
import employee.Sindicate;

public class Main {
    public static void main(String[] args){
        System.out.println("Olá, seja bem vindo (a) ao Sistema de Folha de Pagamento");
        System.out.println("Qual dos comandos a seguir você deseja executar?");

        System.out.println("1 - Adição de Empregado");
        System.out.println("2 - Remoção de Empregado");
        System.out.println("3 - Lançar um cartão de ponto");
        System.out.println("4 - Lançar um  resultado de venda");
        System.out.println("5 - Lançar uma taxa de serviço");
        System.out.println("6 - Alterar detalhes de um empregado");
        System.out.println("7 - Rodar folha de pagamento para hoje");
        System.out.println("8 - Undo/Redo");
        System.out.println("9 - Agenda de Pagamento");
        System.out.println("10 - Criação de novas agendas de pagamento");
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
                    System.out.println("Adição de um empregado");
                    employee.add();
                    break;
                case 2:
                	System.out.println("Remoção de um empregado");
                	employee.removeEmployee();
                	
                	break;
                case 3:
                	System.out.println("Lançar um cartão de ponto");
                	employee.postTimeCard();
                	break;
                case 4:
                	System.out.println("Lançar uma venda!");
                	employee.postSale();
                	break;
                case 5:
                	System.out.println("Lançar uma taxa de serviço!");
                	//employee.postSale();
                	break;
                case 6: 
                	System.out.println("Alterar detalhes de um empregado!");
                	System.out.println("Esses dados são referentes a:");
                	System.out.println("1 - Informações do empregado na EMPRESA");
                	System.out.println("2 - Informações do empregado na SINDICATO");
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
                	System.out.println("Das ações de 1 - 7 qual será mudada?");
                	option = scanner.nextInt();
                	if(option == 1) {
                		
                	} else if(option == 2) {
                		
                	} else if(option == 3) {
                		
                	} else if(option == 4) {
                		
                	} else if(option == 5) {
                		
                	} else if(option == 6) {
                		
                	} else {
                		System.out.println("Opção inválida!");
                	}
                	break;
            }
            

            System.out.println("Informe um novo comando, digite 11 para sair ou 0 para mostrar a lista de comandos.");
            //int newcomando = scanner.nextInt();
            //comando = newcomando;
        } while(comando != 11);
        scanner.close();
        
        System.out.println("Você saiu do sistema. Até breve!");

        
    }
}

