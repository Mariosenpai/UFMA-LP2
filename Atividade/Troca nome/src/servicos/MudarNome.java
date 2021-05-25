package servicos;

public class MudarNome implements Pessoa, Crianca, Conjuge {

    @Override
    public String mudarNomePessoa(String mudarNome) {

        if (mudarNome.contains("homem") || mudarNome.contains("mulher")) {

            mudarNome = mudarNome.replace("mulher", "pessoa");
            mudarNome = mudarNome.replace("homem", "pessoa");

            return mudarNome;
        }

        return null;
    }

    @Override
    public String mudarNomeConjuge(String mudarNome) {

        if (mudarNome.contains("esposa") || mudarNome.contains("marido")) {

            mudarNome = mudarNome.replace("esposa", "conjuge");
            mudarNome = mudarNome.replace("marido", "conjuge");

            return mudarNome;
        }

        return null;
    }

    @Override
    public String mudarNomeCrianca(String mudarNome) {

        String m = "menino";
        String mm = "menina";

        if (mudarNome.contains(m) || mudarNome.contains(mm)) {

            mudarNome = mudarNome.replace(m, "criança");
            mudarNome = mudarNome.replace(mm, "criança");

            return mudarNome;
        }

        return null;
    }

}
