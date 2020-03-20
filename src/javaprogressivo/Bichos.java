package javaprogressivo;

public class Bichos { //Exemplos de polimorfismo
    public static void main(String[] args) {
        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Cachorro pulguento = new Cachorro();

        bichano.som();
        mimosa.som();
        pulguento.som();
        pulguento.reagir("Apanhar");
        pulguento.reagir(11, 25);
        pulguento.reagir(false);
    }
}
