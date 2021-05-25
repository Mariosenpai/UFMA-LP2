package servicos;

import java.util.ArrayList;
import java.util.Scanner;

public class OperVar {

    public String[] var;

    public void getOperVar(ArrayList<String> antDep) {
        String expre;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a expressao.");
        expre = scan.nextLine();

        var = expre.split(" ");

        // pega o operadores e variaveis
        for (int i = 0; i < var.length; i++) {

            antDep.add(var[i]);

        }

    }

    public void getTransVar(ArrayList<String> antDep) {

        Trans trans = new Trans();

        Scanner scan = new Scanner(System.in);
        // transforma variaveis em Strings numericas
        for (int i = 0; i < antDep.size(); i++) {
            if (!trans.contNum(antDep.get(i))) {
                System.out.println("Valor da variavel " + antDep.get(i) + ":");
                String valorVar = scan.nextLine();
                antDep.set(i, valorVar);

            }

        }

    }
}
