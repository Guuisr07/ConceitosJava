package contas;

public class TestaGerente {
    public static void main(String[] args) {

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Gerente();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());


        Gerente gerente = new Gerente();
        gerente.setNome("Guilherme");
        gerente.setSenha(4321);

        /*Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);
        System.out.println(funcionario.getBonificacao());*/
    }
}
