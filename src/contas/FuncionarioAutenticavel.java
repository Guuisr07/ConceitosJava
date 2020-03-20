package contas;

public class FuncionarioAutenticavel extends Funcionario {
    public void autentica (int senha){

    }

    public interface Autenticavel {//Aqui e usado o interface que e como um contrato, onde quem "assina" tem total responsabilidade de comprir o objetivo expresso na interface, ela so expoe o objetivo a se fazer e nao como ele faz. Como ele faz ser definido em uma implementacao dessa interface
        boolean autentica(int senha);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
