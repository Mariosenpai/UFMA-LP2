package intface;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import dados.*;
import serviços.Cadastra;
import serviços.FolhaDePagamento;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Cadastra cadastros = new Cadastra();
        FolhaDePagamento pag = new FolhaDePagamento();

        int sn = 0;

        ArrayList<FuncionarioComum> listaF = new ArrayList<>();
        ArrayList<Gerente> listaG = new ArrayList<>();
        ArrayList<Horista> listaH = new ArrayList<>();

        while (true) {
            System.out.println(
                    "Qual Funcionario deseja cadastra: Comum(1) Gerente(2) Horista(3) Sair para a folha de pagamento(0)");
            sn = scan.nextInt();

            if (sn == 0) {
                break;
            }

            if (sn == 1) {

                cadastros.cadastrarComum(listaF);

            }

            if (sn == 2) {

                cadastros.cadastraGerente(listaG);

            }

            if (sn == 3) {

                cadastros.cadastraHorista(listaH);

            }
        }

        pag.PagTotal(listaF, listaG, listaH);

    }
}
