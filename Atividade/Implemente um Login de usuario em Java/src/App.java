import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean continu = true;
        String nome, senha;
        Scanner scan = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("faço seu cadastro agora!!");

        System.out.println("Login:");
        nome = scan.nextLine();
        System.out.println("Senha:");
        senha = scan.nextLine();

        System.out.println("Cadastro concluido.");

        usuario.cadatras(nome, senha);

        while (continu) {

            System.out.println("Digite Login:");
            nome = scan.nextLine();

            System.out.println("Digite sua senha:");
            senha = scan.nextLine();

            if (nome.equals(usuario.nome) && senha.equals(usuario.senha)) {

                System.out.println("Tudo certo");
                continu = false;

            } else {

                System.out.println("Seu login ou senha estao errados tente novamente");

            }

        }
    }
}
