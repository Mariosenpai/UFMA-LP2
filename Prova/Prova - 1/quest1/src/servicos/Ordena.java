package servicos;

import java.util.ArrayList;

public class Ordena {

    public void ordemDeExe(ArrayList<String> antDep) {
        Trans trans = new Trans();

        trans.poten(antDep);
        trans.multDiv(antDep);
        trans.somSub(antDep);

        for (int i = 0; i < antDep.size(); i++) {
            System.out.print(antDep.get(i) + " ");
        }

    }

}
