package javaprogressivo;

public class Vaca extends Animal {
    public Vaca(){
        this.nome = "Vaca";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("A " + this.nome + " que tem " + this.numeroPatas + " patas, faz MUUU");
    }
}
