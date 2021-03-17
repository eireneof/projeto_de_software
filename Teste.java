import java.util.Scanner;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
		
		System.out.println("Seja Bem-Vindo! Insira seu nome: ");
		nome = scanner.nextLine();
        System.out.println("Infome o comando que deseja usar, "+nome );

        int comando = scanner.nextInt();

        while(comando != 0) {
            if(comando == 1) {
                System.out.println("Adição de um empregado.");
                System.out.println("Qual o nome do novx empregadx?");
                String nomeEmpregado = scanner.nextLine();
                //a aleitura dessa variável nomeEmpregado está dando errado e ainda não sei pq
                System.out.println("Informe o endereço de "+nomeEmpregado);
                String enderecoEmpregado = scanner.nextLine();
                System.out.println("Qual o nome a categoria de empregado?");
                System.out.println("(1) - horista");
                System.out.println("(2) - assalariado");
                System.out.println("(3) - comissionado");
                int categoriaFuncionario = scanner.nextInt();
                System.out.println("Novx funcionárix adicionadx: " +nomeEmpregado);
                System.out.println("Endereço: " +enderecoEmpregado);
                if(categoriaFuncionario == 1) {
                    System.out.println("(1) - horista");
                }
                else if(categoriaFuncionario == 2) {
                    System.out.println("(2) - assalariado");
                }
                else{
                    System.out.println("(3) - comissionado");
                }
                Random rand = new Random();
                int numeroEmpregado = rand.nextInt(10000);
                System.out.println("Número no Sistema: " +numeroEmpregado);
                System.out.println("Muito bem! Seja bem-vindx, " +nomeEmpregado);

            }
            else if(comando == 2) {
                Random rand = new Random();
                System.out.println("Remoção de um empregado.");
                System.out.println("Informe o número do empregado a ser removido");
                int numeroRemovido = scanner.nextInt();
                if(rand.nextInt(100) > 85) {
                    System.out.println("Infelizmente esse funcionário não foi encontrado, tente novamente.");
                }
                else {
                    System.out.println("Remoção bem sucedida do empregado: " +numeroRemovido);
                }
            }
            else if(comando == 3) {
                System.out.println("Lançar um cartão de ponto.");
            }
            else if(comando == 4) {
                System.out.println("lançar um resultado de venda.");
            }
            else if(comando == 5) {
                System.out.println("Lançar uma taxa de serviço.");
            }
            else if(comando == 6) {
                System.out.println("Alterar detalhes de um empregado.");
            }
            else if(comando == 7) {
                System.out.println("Rodar a folha de pagamento para hoje.");
            }
            else if(comando == 8) {
                System.out.println("Undo/redo.");
            }
            else if(comando == 9) {
                System.out.println("Agenda de Pagamento.");
            }
            else if(comando == 10) {
                System.out.println("Criação de Novas Agendas de Pagamento.");
            }
            System.out.println("Informe um novo comando ou digite 0 para sair.");
            comando = scanner.nextInt();

        }
        System.out.println("Você saiu do sistema, até a próxima!");
    }
       
}


