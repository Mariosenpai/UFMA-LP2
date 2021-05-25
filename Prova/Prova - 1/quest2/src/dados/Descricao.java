package dados;

public abstract class Descricao {

    protected String descricao;
    protected String local;

    Descricao(String descricao, String local) {

        this.descricao = descricao;
        this.local = local;

    }

    public abstract void acao();

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

}
