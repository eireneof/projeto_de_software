public class Empregado {

    String nome;
    String endereco;
    double cartaoDePonto;

    public Empregado(String nome, String endereco, double cartaoDePonto) {
        this.nome = nome; //this é o próprio objeto da classe
        this.endereco = endereco;
        this.cartaoDePonto = cartaoDePonto;
    }

    public String printInformacoesEmpregado() {
        return "Nome: " + this.nome +
                "\nEndereço: " + this.endereco + 
                "\nCartão de Ponto: " + this.cartaoDePonto;
    }

    public String printInformacoesEmpregado(Empregado empregado) {
        return "Nome: " + this.nome +
                "\nEndereço: " + this.endereco + 
                "\nCartão de Ponto: " + this.cartaoDePonto +
                "\n-----------------------------------------" +
                "\nNome: " + empregado.nome +
                "\nEndereço: " + empregado.endereco + 
                "\nCartão de Ponto: " + empregado.cartaoDePonto;
    }
    
}
