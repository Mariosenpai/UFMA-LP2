package inteface;

import java.util.Scanner;

import servicos.ConteudoCSV;

public class App {
    public static void main(String[] args) throws Exception {

        ConteudoCSV c = new ConteudoCSV();
        Scanner scan = new Scanner(System.in);
        Scanner scanNome = new Scanner(System.in);
        int esc;
        String nome;

        while (true) {
            System.out.println("1 - Mostra todo Arquivo CSV.\n" + "2 - Quais orgao existentes(Sem repeticoes).\n"
                    + "3 - Quanto curriculos estao alocados para cada orgao.\n" + "4 - Busca por nome.\n"
                    + "0 - SAIR.");

            esc = scan.nextInt();

            if (esc == 0) {
                break;
            }

            if (esc == 1) {
                c.listaCompletaCSV();
            } else if (esc == 2) {
                c.listaOrgao();
            } else if (esc == 3) {
                c.listaCurriculos();
            } else if (esc == 4) {
                System.out.println("Consulta por nome\nDigite o nome:");
                nome = scanNome.nextLine();
                c.consultaPorNome(nome);
            } else {
                System.out.println("Opçao invalida");
            }

        }
        scan.close();
        scanNome.close();
    }
}
