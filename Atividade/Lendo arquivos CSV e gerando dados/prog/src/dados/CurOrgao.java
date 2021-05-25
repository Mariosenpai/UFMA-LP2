package dados;

public class CurOrgao {

    private String orgao;
    private String nome;
    private int numCurriculos;

    public CurOrgao(String orgao) {

        this.orgao = orgao;
        this.numCurriculos = 0;

    }

    public void addCur() {
        this.numCurriculos++;
    }

    public String getOrgao() {
        return this.orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public int getNumCurriculos() {
        return this.numCurriculos;
    }

    public void setNumCurriculos(int numCurriculos) {
        this.numCurriculos = numCurriculos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
