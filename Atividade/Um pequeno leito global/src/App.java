public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        double money;

        System.out.println("Ola qual seu nome?:");

        nome = Leitor.leitorString();

        System.out.println("qual sua idade");
        idade = Leitor.leitorInt();

        System.out.println("Quantos dinheros vc tem?");
        money = Leitor.leitorDouble();

        System.out.println(
                "Seu nome é " + nome + " e voce tem quantos " + idade + " e " + money + " isso tudo de dinheiro kkkk");

    }
}
