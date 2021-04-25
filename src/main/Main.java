package main;

import java.util.Scanner;
import java.util.Random;
import java.util.Stack;

import employee.Employee;

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
        int comando = scanner.nextInt();
        do {
            switch(comando) {
                case 1:
                    System.out.println("Estou entrando em 1");
                    Employee employee = new Employee(1000);
                    employee.add();
                    break;
            }

            System.out.println("Informe um novo comando, digite 11 para sair ou 0 para mostrar a lista de comandos.");
            comando = scanner.nextInt();
        } while(comando != 11);

        scanner.close();
    }
}

