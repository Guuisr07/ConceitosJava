package contas;

public abstract class Funcionario { //Foi definido que e uma classe abstrata pois serve apenas como uma referencia, para as subclasses e nao pode ser instanciada
    protected String nome;
    protected String cpf;
    protected double salario;


    public abstract double getBonificacao();//Este metodo possui o abstract pois e um metodo que deve ser reescrito por todas as subclasses que vao invoca-lo, e uma obrigacao que seja instanciado e modificado a cada subclasse criada.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
