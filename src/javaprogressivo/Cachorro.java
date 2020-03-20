package javaprogressivo;

public class Cachorro extends Gato {

    public Cachorro(){
        this.nome = "Cachorro";
        this.numeroPatas = 4;
    }

    public void reagir(boolean dono) {//(NA MESMA CLASSE) Polimorfismo de sobrecarga, onde e possivel mudar os metodos com o mesmo nome mas assinaturas diferentes ( tipo de retorno )
        if (dono == true){
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir (int hora, int minuto){
        if(hora < 12){
            System.out.println("Abanar");
        } else if ( hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir (String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar rabo ou latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    @Override // (CLASSES DIFERENTES) Polimorfismo de sobreposicao, possui a mesma assinatura( tipo de retorno ) em todas as classes que usam o metodo som
    public void som() {
        System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz AU! AU! AU!");
    }
}
