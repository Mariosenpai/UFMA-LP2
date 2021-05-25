package dados;

public class Doc extends Descricao {

    public Doc(String descricao, String local) {
        super(descricao, local);
    }

    @Override
    public void acao() {
        System.out.println("ler");
    }

}
