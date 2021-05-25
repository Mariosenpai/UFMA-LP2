package dados;

public class Avaliacao {

    private String identificador;
    private String nome;
    private String avaliacao;

    public Avaliacao(String identificador, String nome, String avaliacao) {
        this.identificador = identificador;
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

}
