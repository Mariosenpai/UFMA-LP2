package servicos;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.namespace.QName;

import dados.*;

public class Add {

    public void addList(ArrayList<Doc> docList, ArrayList<Musica> musicList, ArrayList<Video> videoList) {

        Scanner scan = new Scanner(System.in);
        String tipo;
        String d;
        String l;
        String sair;

        while (true) {
            System.out.println("ADICIONA MIDIAS.");
            System.out.println("Tipo do arquivos:(musica)(doc)(video)");
            tipo = scan.nextLine();
            if (tipo.equals("musica")) {

                System.out.println("Arquivo do tipo " + tipo + " ");
                System.out.println("Descricao:");
                d = scan.nextLine();
                System.out.println("Local do arquivo:");
                l = scan.nextLine();

                Musica arq = new Musica(d, l);

                musicList.add(arq);

                System.out.println("\nArquivo Adicionado com sucesso.\nAdiciona outro arquivos: (S/N)");
                sair = scan.nextLine();
                if (sair.equals("n")) {
                    break;
                }

            } else if (tipo.equals("doc")) {

                System.out.println("Arquivo do tipo " + tipo + "");
                System.out.println("Descricao:");
                d = scan.nextLine();
                System.out.println("Local do arquivo:");
                l = scan.nextLine();

                Doc arq = new Doc(d, l);

                docList.add(arq);

                System.out.println("\nArquivo Adicionado com sucesso.\nAdiciona outro arquivos: (S/N)");
                sair = scan.nextLine();
                if (sair.equals("n")) {
                    break;
                }

            } else if (tipo.equals("video")) {

                System.out.println("Arquivo do tipo " + tipo + "");
                System.out.println("Descricao:");
                d = scan.nextLine();
                System.out.println("Local do arquivo:");
                l = scan.nextLine();

                Video arq = new Video(d, l);

                videoList.add(arq);

                System.out.println("\nArquivo Adicionado com sucesso.\nAdiciona outro arquivos: (S/N)");
                sair = scan.nextLine();
                if (sair.equals("n")) {
                    break;
                }

            } else {
                System.out.println("Tipo de arquivo incompativel");
            }

        }

    }

}
