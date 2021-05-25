package servicos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import dados.*;

public class ConteudoCSV {

    private String csvArquivo = "C:\\Users\\Mario\\Documents\\UFMA\\2021.1\\LP2\\Atividade\\Lendo arquivos CSV e gerando dados\\curriculos.csv";
    private BufferedReader conteudoCSV = null;
    private String linha = "";
    private String separadorCSV = ";";

    public void listaCompletaCSV() {

        try {

            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoCSV.readLine()) != null) {

                String[] dados = linha.split(separadorCSV);

                System.out.println("ID = " + dados[0] + " || Nome = " + dados[1] + " || Nome Citaçoes = " + dados[2]
                        + " || Nome Orgao = " + dados[3]);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutBouds: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Erro: " + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO Erro: " + e.getMessage());
                }
            }
        }

    }

    // Pega todos os orgao q estao no index 3 do arquivo CSV e bota em um ArryList
    // depois bota iss em um set
    // Set por definiçao nao aceita valores repiditos logo iria apaga todos os
    // valores repetidos

    public void listaOrgao() {

        ArrayList<String> orgao = new ArrayList<>();

        try {

            BufferedReader conteudoStaticCSV = null;

            conteudoStaticCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoStaticCSV.readLine()) != null) {

                String[] dadosS = linha.split(separadorCSV);
                orgao.add(dadosS[3]);

            }
            conteudoStaticCSV.close();

            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            int i = 0;
            Set<String> set = new HashSet<>(orgao);
            orgao.clear();
            orgao.addAll(set);

            for (i = 0; i < orgao.size(); i++) {
                System.out.println("Nome Orgao = " + orgao.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutBouds: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Erro: " + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO Erro: " + e.getMessage());
                }
            }
        }

    }

    // tem 2 arrylist um que nao tem orgao repetidos e outros quem tem orgaos
    // repeitdos
    // eu comparo todos os orgao com os orgao que nao estao repetidos e toda vez q
    // eu acho um igual eu uso a funçao
    // AddCur que esta em "CurOrgao" adicionando um curriculo aquele orgao e toda
    // vez q ele for encontrado novamente iria adiciona 1 no curriculo

    public void listaCurriculos() {

        ArrayList<CurOrgao> orgao = new ArrayList<>();
        ArrayList<CurOrgao> total = new ArrayList<>();

        try {

            BufferedReader conteudoStaticCSV = null;

            conteudoStaticCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoStaticCSV.readLine()) != null) {

                String[] dadosS = linha.split(separadorCSV);
                CurOrgao dadosC = new CurOrgao(dadosS[3]);
                orgao.add(dadosC);
                total.add(dadosC);

            }
            conteudoStaticCSV.close();
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            Set<CurOrgao> set = new HashSet<>(orgao);
            orgao.clear();
            orgao.addAll(set);

            // ArrayList<CurOrgao> curOrg = new ArrayList<>();
            int i = 0;
            int j = 0;

            while (i < total.size()) {

                for (j = 0; j < orgao.size(); j++) {

                    if (total.get(i).getOrgao().equals(orgao.get(j).getOrgao())) {
                        orgao.get(j).addCur();
                        break;
                    }
                }

                i++;

            }

            for (i = 0; i < orgao.size(); i++) {
                System.out.println("Nome orgao = " + orgao.get(i).getOrgao() + " || Numero de Curriculos = "
                        + orgao.get(i).getNumCurriculos());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutBouds: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Erro: " + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO Erro: " + e.getMessage());
                }
            }
        }

    }

    // funçao contais a String nao precisa ser necessariamente igual a outra
    // iria printar todos os nome que tem aquele sequencia de caracteres

    public void consultaPorNome(String nome) {

        try {

            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
            boolean nTem = true;

            while ((linha = conteudoCSV.readLine()) != null) {

                String[] dados = linha.split(separadorCSV);
                if (dados[1].contains(nome)) {
                    System.out.println("ID = " + dados[0] + " || Nome = " + dados[1] + " || Nome Citaçoes = " + dados[2]
                            + " || Nome Orgao = " + dados[3]);
                    nTem = false;
                }

            }

            if (nTem) {
                System.out.println("Nome nao existe no arquivo CSV.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutBouds: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Erro: " + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("IO Erro: " + e.getMessage());
                }
            }
        }

    }

}
