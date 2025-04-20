public class Serie extends ConteudoNetflix {
    private String episodio;

    public Serie(String titulo, String episodio) {
        super(titulo, episodio);
        this.episodio = episodio;
    }

    public String getEpisodio() {
        return episodio;
    }

    @Override
    public String reproduzir() {
        return "Reproduzindo a série " + getTitulo() + "; Episódio: " + getEpisodio() + "...\n";
    }
}
