package dados;

public class Musica extends Descricao {

    public Musica(String descricao, String local) {
        super(descricao, local);
    }

    @Override
    public void acao() {
        System.out.println("Ouvir");
    }

}
