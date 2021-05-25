package dados;

public class Video extends Descricao {

    public Video(String descricao, String local) {
        super(descricao, local);
    }

    @Override
    public void acao() {
        System.out.println("Visualizar");
    }

}
