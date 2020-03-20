package projetoyt;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3]; //Usando vetor para criar 3 videos
        v[0] = new Video("Ensinando cozinhar");
        v[1] = new Video("Jogadas boas");
        v[2] = new Video("Erros");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Guilherme", 19, "Masculino", "guisantana0204@gmail.com");
        u[1] = new Usuario("Adriana", 25, "Feminino", "adriana01@gmail.com");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());//Guilherme assiste Jogadas boas

        vis[1] = new Visualizacao(u[0], v[2]);//Guilherme assiste Erros
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());



        /*System.out.println("USUARIOS --------------------|");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString() + "\n");
        System.out.println("VIDEOS   --------------------|");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());*/

    }
}
