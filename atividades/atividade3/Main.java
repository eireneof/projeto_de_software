package atividades.atividade3;
//import Empregado;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.initEmpregado("Eirene", "Maceio", 12.0);
        System.out.println(empregado1.printInformacoesEmpregado());
        //empregado1.name = "Teste";
        //não aparece pq coloquei private
        
        Horista horista = new Horista();
        Empregado horista2 = new Horista(); //horista é filho de Empregado

        Empregado assalariado = new Assalariado();

        Empregado comissionado = new Comissionado();
        horista.setNome("Teste");
        horista.setCartaoDePonto(12);
        horista.getNome();

        System.out.println(horista.getNome());
        //Empregado empregado2 = new Empregado("Adhemar", "Arapiraca", 13.10);

        //System.out.println(empregado1.printInformacoesEmpregado(empregado2));
    
    }
}
