public class Filme extends ConteudoNetflix {
    private String duracao;

    public Filme(String titulo, String duracao) {
        super(titulo, duracao);
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }

    @Override
    public String reproduzir() {
        return "Reproduzindo o filme " + getTitulo() + "...\n";
    }
}
