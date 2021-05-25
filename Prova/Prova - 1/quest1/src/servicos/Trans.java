package servicos;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Trans {

    // se tem numero na String
    public boolean contNum(String arg) {
        // transforma returna true se a string passada tive um dos elemento que esta em
        // num
        final String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "**" };

        String str = new String("");

        for (int i = 0; i < arg.length(); i++) {
            str = Character.toString(arg.charAt(i));

            for (int j = 0; j < num.length; j++) {
                if (str.equals(num[j])) {
                    return true;
                }

            }
        }
        return false;

    }

    public void poten(ArrayList<String> antDep) {

        int rep = 0;
        for (int i = 0; i < antDep.size(); i++) {

            if (antDep.get(i).equals("**")) {

                double ant = Double.valueOf(antDep.get(i - 1)).doubleValue();
                double dep = Double.valueOf(antDep.get(i + 1)).doubleValue();

                double result = Math.pow(ant, dep);

                String resultStr = Double.toString(result);

                antDep.set(i - 1, resultStr);
                rep = 1;
            }

            if (rep == 1) {

                antDep.remove(i);
                antDep.remove(i);
                rep = 0;
                i -= 2;

            }

        }

    }

    public void multDiv(ArrayList<String> antDep) {
        int rep = 0;
        for (int i = 0; i < antDep.size(); i++) {

            if (antDep.get(i).equals("*")) {
                // pega o anterior e o posterior
                double ant = Double.valueOf(antDep.get(i - 1)).doubleValue();
                double dep = Double.valueOf(antDep.get(i + 1)).doubleValue();
                // efetua a operaçao
                double result = ant * dep;
                // transforma novamente para um String
                String resultStr = Double.toString(result);
                // e bota o resultado na posiçao anterior a o operador
                antDep.set(i - 1, resultStr);
                rep = 1;
            }

            if (antDep.get(i).equals("/")) {

                double ant = Double.valueOf(antDep.get(i - 1)).doubleValue();
                double dep = Double.valueOf(antDep.get(i + 1)).doubleValue();

                double result = ant / dep;

                String resultStr = Double.toString(result);

                antDep.set(i - 1, resultStr);
                rep = 1;
            }
            // apagar o operador e o numero a sua direita
            // deixando apenas a resposta q estava a esquerda
            // o i tem q volta 2 casa para pode interar novamente
            if (rep == 1) {

                antDep.remove(i);
                antDep.remove(i);
                rep = 0;
                i -= 2;

            }

        }

    }

    public void somSub(ArrayList<String> antDep) {
        int rep = 0;
        for (int i = 0; i < antDep.size(); i++) {

            if (antDep.get(i).equals("+")) {

                double ant = Double.valueOf(antDep.get(i - 1)).doubleValue();
                double dep = Double.valueOf(antDep.get(i + 1)).doubleValue();

                double result = ant + dep;

                String resultStr = Double.toString(result);

                antDep.set(i - 1, resultStr);
                rep = 1;
            }

            if (antDep.get(i).equals("-")) {

                double ant = Double.valueOf(antDep.get(i - 1)).doubleValue();
                double dep = Double.valueOf(antDep.get(i + 1)).doubleValue();

                double result = ant - dep;

                String resultStr = Double.toString(result);

                antDep.set(i - 1, resultStr);
                rep = 1;
            }

            if (rep == 1) {

                antDep.remove(i);
                antDep.remove(i);
                rep = 0;
                i -= 2;

            }

        }

    }

}
