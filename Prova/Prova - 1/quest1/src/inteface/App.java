package inteface;

import java.util.ArrayList;

import servicos.*;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<String> antDep = new ArrayList<>();

        OperVar pegar = new OperVar();
        Ordena ordena = new Ordena();

        pegar.getOperVar(antDep); // pega as variaveis e bota em um ArrayList de String
        pegar.getTransVar(antDep); // transforma as variaveis em String numericas
        ordena.ordemDeExe(antDep); // faz as operaçoes na ordem de execuçao

    }
}
