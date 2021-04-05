package atividades.atividade3;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Eirene", "Maceió", 10.0);
        Empregado empregado2 = new Empregado("Adhemar", "Arapiraca", 13.10);

        System.out.println(empregado1.printInformacoesEmpregado(empregado2));
    
    }
}
