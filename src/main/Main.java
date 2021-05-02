package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Stack;

import java.util.List;
import java.util.ArrayList;

import employee.Employee;
import employee.Sindicate;
import historic.HistoricComands;

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
        
        HistoricComands comando = new HistoricComands();
        
        int commandVerify;
        
        do {
        	commandVerify = scanner.nextInt();
        	if (commandVerify != 8 && commandVerify != 0 && commandVerify != 11)
        		comando.setCurrent(commandVerify);
        	
        	System.out.println("undo: " + comando.getCurrentUndos() + " | " + "current:" + comando.getCurrent() + " | " + "redo: " + comando.getCurrentRedos());
        	int option;
        	Sindicate sindicate = new Sindicate();
            Employee employee = new Employee();
            switch(commandVerify) {
                case 1:
                    System.out.println("Adi��o de um empregado");
                    //employee.add(); //okay
                    break;
                case 2:
                	System.out.println("Remo��o de um empregado");
                	//employee.removeEmployee(); //okay
                	
                	break;
                case 3:
                	System.out.println("Lan�ar um cart�o de ponto");
                	//employee.postTimeCard();
                	break;
                case 4:
                	System.out.println("Lan�ar uma venda!");
                	//employee.postSale();
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
                	/* option = scanner.nextInt();
                	if(option == 1)
                		employee.employeeChange();
                	else if(option == 2)
                		sindicate.changeMember(); */
                case 7:
                	System.out.println("Rodar folha de pagamento para hoje!");
                	break;
                case 8:
                	System.out.println("Undo/Redo!");
                	System.out.println("Informe o que deseja fazer: ");
                	System.out.println("1 - Undo");
                	System.out.println("2 - Redo");
                	option = scanner.nextInt();
                	int undoRedo;
                	if(option == 1) {
                		undoRedo = comando.undoCommand();
                		//System.out.println("Depois do undo:");
                		//System.out.println("undo: " + comando.getCurrentUndos() + " | " + "current:" + comando.getCurrent() + " | " + "redo: " + comando.getCurrentRedos());
                	} else if(option == 2) {
                		undoRedo = comando.redoCommand();
                		//System.out.println("Depois do redo:");
                		//System.out.println("undo: " + comando.getCurrentUndos() + " | " + "current:" + comando.getCurrent() + " | " + "redo: " + comando.getCurrentRedos());
                	} else {
                		System.out.println("Op��o inv�lida!");
                	} 
                	break;
            }
            

            System.out.println("Informe um novo comando, digite 11 para sair ou 0 para mostrar a lista de comandos.");
        } while(commandVerify != 11);
        scanner.close();
        
        System.out.println("Voc� saiu do sistema. At� breve!");

        
    }
}

