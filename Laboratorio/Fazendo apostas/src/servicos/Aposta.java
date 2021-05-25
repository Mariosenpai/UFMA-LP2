package servicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Aposta {

    public void noRepit(int nRep, Random a, ArrayList<Integer> noRepetidos, HashMap<Integer, Integer> repetidos) {
        for (int i = 0; i < 6; i++) {

            int rep = 0;
            int num = a.nextInt((99 - 10) + 1) + 10;

            for (int j = 0; j < noRepetidos.size(); j++) {
                if (noRepetidos.get(j) == num) {
                    repetidos.put(num, num);
                    rep++;
                }
            }

            if (rep >= nRep) {
                i--;
                continue;
            }

            noRepetidos.add(num);
            System.out.print(num);
            if (i < 5) {
                System.out.print(" , ");
            }

        }
        System.out.print("\n");

    }

}
