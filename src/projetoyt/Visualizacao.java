package projetoyt;

public class Visualizacao {//Classe que vai agregar Usuario a Video
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //Polimorfismo de Sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);//Se nao passar nenhuma avaliacao, ela sera 5
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        //colocar notas em cima de uma porcentagem recebida
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if (porc <= 50){
            tot = 5;
        }else if (porc <= 90){
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //Polimorfismo de sobreposicao
    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
