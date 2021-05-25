package servicos;

import java.util.ArrayList;
import java.util.Scanner;

import dados.*;

public class Busca {

    public void buscaDMV(ArrayList<Doc> docList, ArrayList<Video> videoList, ArrayList<Musica> musicList) {

        Scanner scan = new Scanner(System.in);
        String midia;
        int index;

        while (true) {
            System.out.println("BUSCA MIDIAS.");
            System.out.println("Escolher midia: musica, video, doc.\nSair da busca(0)");
            midia = scan.nextLine();

            if (midia.equals("0")) {
                break;
            }

            if (midia.equals("doc")) {

                if (docList.size() == 0) {
                    System.out.println("Nao foi adicionado nenhum documento.");
                    continue;
                }

                System.out.println("Lista de todos os doc");

                for (int i = 0; i < docList.size(); i++) {
                    System.out.println("Index:" + (i + 1) + "\nDescrição:" + docList.get(i).getDescricao() + " Local:"
                            + docList.get(i).getLocal() + "\n");
                }

                System.out.println("Selecione o arquivo de acordo seu Index:");
                index = scan.nextInt();
                index--;
                docList.get(index).acao();

            } else if (midia.equals("musica")) {

                if (musicList.size() == 0) {
                    System.out.println("Nao foi adicionado nenhuma musica.");
                    continue;
                }

                System.out.println("Lista de todas as Musica");

                for (int i = 0; i < musicList.size(); i++) {
                    System.out.println("Index:" + (i + 1) + "\nDescrição:" + musicList.get(i).getDescricao() + " Local:"
                            + musicList.get(i).getLocal() + "\n");
                }

                System.out.println("Selecione o arquivo de acordo seu Index:");
                index = scan.nextInt();
                index--;
                musicList.get(index).acao();

            } else if (midia.equals("video")) {

                if (videoList.size() == 0) {
                    System.out.println("Nao foi adicionado nenhum video.");
                    continue;
                }

                System.out.println("Lista de todos os videos");

                for (int i = 0; i < videoList.size(); i++) {
                    System.out.println("Index:" + (i + 1) + "\nDescrição:" + videoList.get(i).getDescricao() + " Local:"
                            + videoList.get(i).getLocal() + "\n");
                }

                System.out.println("Selecione o arquivo de acordo seu Index:");
                index = scan.nextInt();
                index--;
                videoList.get(index).acao();

            } else {
                System.out.println("Tipo de midia inexistente.");
            }
        }
    }
}
