package contas;

public class Diretor extends Funcionario implements FuncionarioAutenticavel.Autenticavel {
    private int senha;

    //Implementacao
    public boolean autentica(int senha){
        if(this.senha != senha){
            return false;
        }
        return true;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
