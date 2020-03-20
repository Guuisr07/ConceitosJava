package contas;

public class Conta {
    private String nome;
    private String agencia;
    private int numero;
    private double saldo;
    private static int totalDeContas;       //Declarando static para ele nao ser so mais um atributo do objeto, mas sim da classe inteira
    double rendimento;

    //Criando o construtor
    Conta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    Conta(String nome) {
        this.nome = nome;
    }

    /*Construtor com o titular da conta
    Conta(String titular){
        this.titular = titular;
    }*/

    //Criando um metodo get para poder acessar a informacao do total de contas em outra classe
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    //Setando valores nos atributos

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }


    public void saca(double quantidade){
        if( quantidade > this.saldo){
            System.out.println("Nao é possivel fazer a operacao, o valor solicitado e maior que o saldo disponivel");
        } else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque efetuado com sucesso . SALDO:" + this.saldo);
        }

    }

    public void deposita(double quantidade){
        if(quantidade < 0){
            System.out.println("Nao e possivel fazer o deposito");
        } else {
            this.saldo += quantidade;
        }
    }

    public double pegaSaldo(){
        return this.saldo;
    }

    void calculaRendimento(){
        this.rendimento = saldo * 0.1;
    }

   /*public  String recuperarDadosParaImpressao(){
        String dados = "Titular: " + this.nome;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo da conta: " + this.saldo;
        dados += "\n----- Data de Abertura da conta -----\n\t\t";
        dados += this.dataDeAbertura.formatada();
        return dados;
    }*/
}

