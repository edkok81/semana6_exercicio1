import java.util.ArrayList;

public class Main {
    public static void imprimirMidias(ArrayList<ConteudoNetflix> midias) {
        for (ConteudoNetflix midia : midias) {
            if(midia instanceof Filme) {
                Filme filme = (Filme) midia;
                System.out.println("O Filme " + filme.getTitulo() + " tem " + filme.getDuracao() + " minutos de duração.");
            } else if (midia instanceof Serie) {
                Serie serie = (Serie) midia;
                System.out.println("A Série é " + serie.getTitulo() + " e o título do Episódio é " + serie.getEpisodio());
            }
            System.out.println(midia.reproduzir());
        }
    }

    public static void main(String[] args) {
        var midias = new ArrayList<ConteudoNetflix>();

        midias.add(new Filme("Memento", "1h32"));
        midias.add(new Serie("The Glass Dome", "The Revelation."));

        imprimirMidias(midias);

    }
}