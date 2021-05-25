package intface;

import servicos.*;

public class App {
    public static void main(String[] args) throws Exception {

        MudarNome mudar = new MudarNome();

        String frase = "esposa e marido gosta de ter menino e a mulher dos sonhos e o homem tambem.";

        frase = mudar.mudarNomeCrianca(frase);

        System.out.println(frase + "\n");

        frase = mudar.mudarNomeConjuge(frase);

        System.out.println(frase + "\n");

        frase = mudar.mudarNomePessoa(frase);

        System.out.println(frase + "\n");

    }
}
