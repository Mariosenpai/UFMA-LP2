package entidades;

public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;

    // construtor
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = "Rua-00000";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.endereco = "Rua-00000";
        this.telefone = "000000000";
    }

    public Pessoa() {
        this.nome = "ze";
        this.endereco = "Rua-000000";
        this.telefone = "000000000";
    }

    // GETS AND SETS
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
