public abstract class ConteudoNetflix {
    private String titulo;

    public ConteudoNetflix(String titulo, String duracao) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract String reproduzir();

}
