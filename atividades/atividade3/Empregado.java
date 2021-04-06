package atividades.atividade3;

public class Empregado {
    private String nome;
    private String endereco;
    private double cartaoDePonto;

    // public Empregado(String nome, String endereco, double cartaoDePonto) {
    //     this.nome = nome; //this é o próprio objeto da classe
    //     this.endereco = endereco;
    //     this.cartaoDePonto = cartaoDePonto;
    // }

    public void initEmpregado(String nome, String endereco, double cartaoDePonto) {
        this.nome = nome; //this é o próprio objeto da classe
        this.endereco = endereco;
        this.cartaoDePonto = cartaoDePonto; 
    }

    public String printInformacoesEmpregado() {
        return "Nome: " + this.nome +
                "\nEndereço: " + this.endereco + 
                "\nCartão de Ponto: " + this.cartaoDePonto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } //método para aplicar valores à variáveis privadas 

    public void setCartaoDePonto(double cartaoDePonto) {
        if (cartaoDePonto >= 0) {
            this.cartaoDePonto = cartaoDePonto;
        } else {
            System.out.println("Valor inválido!");
        }     
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //obs: o get não vem automaticamente com o this, mas é bom colocar 

    public double getCartaoDePonto() {
        return this.cartaoDePonto;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getNome() {
        return this.nome;
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
