package dados;

public abstract class Pessoa {

    protected String nome;
    protected String CPF;
    protected String matricula;

    public Pessoa(String nome, String CPF, String matricula) {
        this.CPF = CPF;
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract void addDisciplinas(Disciplina disciplina);

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
