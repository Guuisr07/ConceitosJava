package contas;

public class TesteConta {
    public static void main(String[] args) {
        //criando uma nova conta
        Conta c1 = new Conta();
        c1.setNome("Guilherme");
        c1.setAgencia("4567-7");
        c1.setNumero(564);

        Conta c2 = new Conta();
        c2.setNome("Guilherme");

        String guilherme = "Guilherme";
        Conta c3 = new Conta(guilherme);

        System.out.println(c1.getNome());
        System.out.println(c1.getAgencia());

        //Para saber quantas contas foram criadas
        int total = Conta.getTotalDeContas();
        System.out.println(total);

        c1.deposita(-30);
        System.out.println("Saldo:" + c1.pegaSaldo());

        if( c1 == c2 ){
            System.out.println("Dados iguais das contas");
        } else {
            System.out.println("Dados diferentes das contas");
        }

        /*System.out.println(c1.recuperarDadosParaImpressao());*/
    }

}
