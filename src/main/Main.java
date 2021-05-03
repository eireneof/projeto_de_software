package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import employee.Employee;
import employee.Sindicate;
import historic.HistoricComands;
import main.Text;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        HistoricComands comando = new HistoricComands();
        Text mainText = new Text();
        int commandVerify;
        mainText.firstContact();
        mainText.showCommands();
        
        do {
        	commandVerify = scanner.nextInt();
        	
        	if (commandVerify != 8 && commandVerify != 0 && commandVerify != 11)
        		comando.setCurrent(commandVerify);
        	
        	int option;
        	Sindicate sindicate = new Sindicate();
            Employee employee = new Employee();
            
            switch(commandVerify) {
            	case 0:
            		mainText.showCommands();
            		break;
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
                	employee.postSale();
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
                case 8: //INCONPLETO
                	System.out.println("Undo/Redo!");
                	System.out.println("Informe o que deseja fazer: ");
                	System.out.println("1 - Undo");
                	System.out.println("2 - Redo");
                	option = scanner.nextInt();
                	int undoRedo;
                	if(option == 1) {
                		undoRedo = comando.undoCommand();
                	} else if(option == 2) {
                		undoRedo = comando.redoCommand();
                	} else {
                		System.out.println("Opção inválida!");
                	} 
                	break;
                case 9: //NÃO INICIADO
                	System.out.println("9 - Agenda de Pagamento");
                	break;
                case 10: //NÃO INICIADO
                	System.out.println("10 - Criação de novas agendas de pagamento");
                	break;
            }
            
            System.out.println("Informe um novo comando, digite 11 para sair ou 0 para mostrar a lista de comandos.");
        } while(commandVerify != 11);
        scanner.close();
    }
}

