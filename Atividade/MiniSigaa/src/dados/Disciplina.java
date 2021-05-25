package dados;

public class Disciplina extends Atividade {

    private String CH;

    public Disciplina(String nome, String codigo, String CH) {
        super(nome, codigo);
        this.CH = CH;
    }

    public String getCH() {
        return this.CH;
    }

    public void setCH(String CH) {
        this.CH = CH;
    }

}
