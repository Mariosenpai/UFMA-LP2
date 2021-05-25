package inteface;

import java.util.ArrayList;
import java.util.Scanner;

import dados.*;
import servicos.*;

public class App {
    public static void main(String[] args) throws Exception {

        Add arq = new Add();
        Busca busca = new Busca();

        ArrayList<Doc> docList = new ArrayList<>();
        ArrayList<Musica> musicList = new ArrayList<>();
        ArrayList<Video> videoList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        int esp;

        while (true) {

            System.out.println("1 - Adiciona a lista " + "\n" + "2 - Busca na lista " + "\n" + "0 - Sair do programa");

            esp = scan.nextInt();

            if (esp == 1) {
                arq.addList(docList, musicList, videoList);
            } else if (esp == 2) {
                busca.buscaDMV(docList, videoList, musicList);
            } else if (esp == 0) {
                break;
            } else {
                System.out.println("Opcao invalida.");
            }
        }

    }
}
