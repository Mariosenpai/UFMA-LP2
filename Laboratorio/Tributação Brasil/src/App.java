import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Pessoa fisica ou Pessoa juridica?");
        String pessoa = scan.nextLine();

        System.out.println("Quanto Durante o Ano essa pessoas ganhou?");
        double rendar = scan.nextDouble();
        System.out.println("Quanto de deducao essa pessoa teve?");
        double deducao = scan.nextDouble();

        if (pessoa.equals("fisica")) {
            Contribuinte p1 = new PessoaFisica(rendar, deducao, "111-1111-11");
            System.out.println("O imposto que a pesssoa deve pagar esta no valor de " + p1.imposto() + " reais.");
        }

        if (pessoa.equals("juridica")) {
            Contribuinte p1 = new PessoaJuridica(rendar, deducao, "111-1111-11");
            System.out.println("O imposto que a empressa deve pagar esta no valor de " + p1.imposto() + " reais.");
        }

    }
}
