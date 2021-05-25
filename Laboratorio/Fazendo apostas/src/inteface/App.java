package inteface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import servicos.Aposta;

public class App {
    public static void main(String[] args) throws Exception {

        Random a = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> noRepetidos = new ArrayList<>();
        ArrayList<Integer> semRegras = new ArrayList<>();
        HashMap<Integer, Integer> repetidos = new HashMap<>();

        Aposta rep = new Aposta();

        int nApost = 0, n, nRep;
        int esc;

        while (true) {
            System.out.println("1 - Sem regras de repitiçoes\n2 - Com regras De repitiçoes\n0 - Sair");
            esc = scan.nextInt();
            if (esc == 0) {
                break;
            }

            if (esc == 1) {

                System.out.println("Quantas apostas devem ser feitas?");
                n = scan.nextInt();

                while (nApost < n) {

                    for (int i = 0; i < 6; i++) {

                        int num = a.nextInt((99 - 10) + 1) + 10;
                        System.out.print(num);
                        if (i < 5) {
                            System.out.print(" , ");
                        }

                    }

                    System.out.print("\n");
                    nApost++;
                }

                System.out.print("\n");

            }

            if (esc == 2) {

                System.out.println("Quantas apostas devem ser feitas?");
                n = scan.nextInt();
                System.out.println("Qual o numero maximo de repetiçoes?");
                nRep = scan.nextInt();

                while (nApost < n) {

                    rep.noRepit(nRep, a, noRepetidos, repetidos);
                    nApost++;

                }

                System.out.print("Numeros repeditos: ");
                System.out.println(repetidos.values());
                System.out.print("\n");

            }
        }

    }
}
