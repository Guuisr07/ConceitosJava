package contas;

public class Gerente extends Funcionario implements FuncionarioAutenticavel.Autenticavel { /*Usa extends aqui porque a classe Gerente e uma extensao de funcionario, ele possui tudo que um funcionario*/ /*Aqui tambem e usado o Implements que serve para implementar a interface Autenticavel, toda interface exige uma implementacao, com base no seu objetivo de interface*/
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    //Implementacao
    public boolean autentica(int senha){
        if(this.senha != senha){
            return false;
        }
        return true;
    }



    @Override //Para mostrar que foi reescrito um metodo
    public double getBonificacao(){ //Aqui foi reescrito o metodo da bonificacao, pois um Funcionario comum recebe em cima só e 10% do salario, enquanto que o gerente recebe 15%
        return this.salario * 1.4 + 100;//Usamos o super para invocar o metodo de funcionario e alterar para o uso de gerente
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
