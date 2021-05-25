
public class Maquina {

    private float saldo;
    private int cont;
    private Ticket vetor[];

    public Maquina() {

        this.saldo = 0;
        this.vetor = new Ticket[100];// aq estou declando o espaço de memoria que o o vetor do tipo ticket precisa
        this.cont = 0;

    }

    public Ticket emitirTicket() {

        this.vetor[cont] = new Ticket();// aq estou botando o tipo ticket dentro do vetor com todos as funcionalidade
                                        // que a funçao ticket tem
                                        // ou seja agora esse vetor na possiçao cont ele se tornou um ticket e apartir
                                        // desse momento agirar como tal
                                        // as outras possiçoes 1 2 3 4 nao tem esse ticket logo se eu tenta acessa elas
                                        // elas retornaram null
        return vetor[cont++];

    }

    public void pagar(int ID) {
        int i;
        for (i = 0; i < vetor.length; i++) {

            if ((vetor[i] != null) && (vetor[i].getID() == ID)) {
                this.saldo += vetor[i].getValor();
                vetor[i].setPago();

                if (vetor[i].getPago()) {
                    System.out.println("Ticket pago com sucesso");
                }

            } else {
                System.out.println("O ticket nao existe.");
            }

        }

    }

    public boolean chegaPagTicket(int ID) {

        int i;
        for (i = 0; i < vetor.length; i++) {
            if ((vetor[i] != null) && (vetor[i].getID() == ID)) {
                return vetor[i].getPago();
            }
        }
        return false;
    }

    public int getVetor() {
        return cont;
    }

    public float getSaldo() {
        return saldo;
    }

}
