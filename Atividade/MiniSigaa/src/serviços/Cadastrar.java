package serviços;

import java.util.ArrayList;
import java.util.Scanner;

import dados.Aluno;
import dados.Curso;
import dados.Disciplina;
import dados.Docente;

public class Cadastrar {

    Scanner scan = new Scanner(System.in);

    String sn = "-1";

    String nome = "";
    String CPF = "";
    String matricula = "";

    public void alunoList(ArrayList<Aluno> listaA) {
        System.out.println("*****************************");
        for (int i = 0; i < listaA.size(); i++) {
            System.out.println("Nome:" + listaA.get(i).getNome() + "\n" + "CPF:" + listaA.get(i).getCPF() + "\n"
                    + "Matricula:" + listaA.get(i).getMatricula() + "\n");
        }
        System.out.println("*****************************");
    }

    public void disciplinasList(ArrayList<Disciplina> listaD) {
        System.out.println("*****************************");
        for (int i = 0; i < listaD.size(); i++) {
            System.out.println("Nome:" + listaD.get(i).getNome() + "\n" + "Codigo:" + listaD.get(i).getCodigo() + "\n"
                    + "CH:" + listaD.get(i).getCH() + "\n");
        }
        System.out.println("*****************************");
    }

    public void docenteList(ArrayList<Docente> listaDoc) {
        System.out.println("*****************************");
        for (int i = 0; i < listaDoc.size(); i++) {
            System.out.println("Nome:" + listaDoc.get(i).getNome() + "\n" + "CPF:" + listaDoc.get(i).getCPF() + "\n"
                    + "Matricula:" + listaDoc.get(i).getMatricula() + "\n");
        }
        System.out.println("*****************************");

    }

    public void cadastrarAluno(ArrayList<Aluno> listaA) {

        System.out.println("*****************************");
        while (true) {

            System.out.println("****CADASTRA ALUNO****");
            System.out.println("Nome:");
            // scan.next();
            nome = scan.nextLine();
            System.out.println("CPF:");
            // scan.next();
            CPF = scan.nextLine();
            System.out.println("Matricula:");
            // scan.next();
            matricula = scan.nextLine();

            System.out.println(
                    "Aluno Cadastrado" + "\n" + "Nome:" + nome + " " + "CPF:" + CPF + " " + "Matricula:" + matricula);

            Aluno p = new Aluno(nome, CPF, matricula);
            listaA.add(p);

            System.out.println("\nDeseja cadastra outro aluno? Sim(1) Não(0):");
            sn = scan.nextLine();

            if (sn.equals("0")) {
                break;
            } else if (sn.equals("1")) {
                continue;
            } else {
                System.out.println("Comando desconhecido\n");
                break;
            }
        }
    }

    public void cadastrarDisciplona(ArrayList<Disciplina> listaD) {

        String nomeDis = "";
        String codigo = "0";
        String ch = "";
        System.out.println("*****************************");
        while (true) {

            System.out.println("****CADASTRA DISCIPLINA****");

            System.out.println("Nome:");
            nomeDis = scan.nextLine();

            System.out.println("Codigo:");
            codigo = scan.nextLine();

            System.out.println("CH:");
            ch = scan.nextLine();

            Disciplina d = new Disciplina(nomeDis, codigo, ch);
            listaD.add(d);

            System.out.println("Para cadastra outro disciplina digite (1) Sair (0).");
            sn = scan.nextLine();

            if (sn.equals("0")) {
                break;
            } else if (sn.equals("1")) {
                continue;
            } else {
                System.out.println("Comando desconhecido\n");
                break;
            }

        }

    }

    public void cadastrarDocente(ArrayList<Docente> listaDoc) {

        String nomeDoc = "";
        String CPFDoc = "";
        String matriculaDoc = "";

        Curso curso = new Curso("Ciencia da computaçao", "10");
        System.out.println("*****************************\n");
        while (true) {

            System.out.println("****CADASTRA DOCENTE****");

            System.out.println("Nome:");
            scan.next();
            nomeDoc = scan.nextLine();

            System.out.println("CPF:");
            scan.next();
            CPFDoc = scan.nextLine();

            System.out.println("Matricula:");
            scan.next();
            matriculaDoc = scan.nextLine();

            System.out.println("Curso de ciencia da computaçao:");

            Docente doc = new Docente(nomeDoc, CPFDoc, matriculaDoc, curso);

            listaDoc.add(doc);

            System.out.println("Deseja cadastrar outro docente digite (1) Sair (0):");
            sn = scan.nextLine();

            if (sn.equals("0")) {
                break;
            } else if (sn.equals("1")) {
                continue;
            } else {
                System.out.println("Comando desconhecido\n");
                break;
            }

        }

    }

    public void cadastrarTurma(ArrayList<Aluno> listaA, ArrayList<Disciplina> listaD, ArrayList<Docente> listaDoc,
            ArrayList<Turma> listTur) {

        if (listaA.size() == 0) {
            System.out.println("Não a Alunos Cadastador para criar uma Turma.");
            return;
        } else if (listaD.size() == 0) {
            System.out.println("Não existe Nenhuma disciplina Cadastrada.");
            return;
        } else if (listaDoc.size() == 0) {
            System.out.println("Não existe Docente cadastrado.");
            return;
        }

        System.out.println("Gostaria de Mostra a lista de Disciplinas disponiveis? Sim(1) Não(0):\n");
        sn = scan.nextLine();
        if (sn.equals("1")) {
            System.out.println("Lista disciplinas Do Curso:");
            disciplinasList(listaD);
        } else if (sn.equals("0")) {

        }

        System.out.println("Gostaria de Mostra A lista de Alunos Cadastrados? Sim(1) Não(0):\n");
        sn = scan.nextLine();
        if (sn.equals("1")) {
            System.out.println("Lista de Alunos Cadastrados:");
            alunoList(listaA);
        } else if (sn.equals("0")) {

        }

        String codDis = "0";
        int dnv = 1;
        String codDoc = "";

        Disciplina disTurma = null;
        Docente docTurma = null;

        if (dnv == 0) {
            return;
        }

        while (true) {

            System.out.println("Esses alunos seram cadastrados na turma\n");

            System.out.println("Qual disciplina Deseja para esse turma?: (Digite o codigo da disciplina)");
            codDis = scan.nextLine();
            for (int i = 0; i < listaD.size(); i++) {

                if (codDis.equals(listaD.get(i).getCodigo())) {

                    disTurma = new Disciplina(listaD.get(i).getNome(), listaD.get(i).getCodigo(),
                            listaD.get(i).getCH());
                    System.out.println("\nConcluido com sucesso\n");
                    break;
                } else if (i == listaD.size()) {
                    System.out.println("Essa disciplina nao existe.");
                }
            }

            System.out
                    .println("Qual docente Deseja cadastra para ministra essa turma?: (Digite o numero de matricula)");
            codDoc = scan.nextLine();
            for (int i = 0; i < listaDoc.size(); i++) {

                if (codDoc.equals(listaDoc.get(i).getMatricula())) {

                    docTurma = new Docente(listaDoc.get(i).getNome(), listaDoc.get(i).getCPF(),
                            listaDoc.get(i).getMatricula(), listaDoc.get(i).getCurso());
                    System.out.println("\nConcluido com sucesso\n");
                    break;

                } else if (i == listaD.size()) {
                    System.out.println("Esse Docente nao existe.");
                }

            }

            if (disTurma != null && docTurma != null) {
                Turma t = new Turma(disTurma, docTurma, listaA);
                listTur.add(t);
                System.out.println("Turma Criada Com Sucesso");
                System.out.println("*****************************");
            }

            System.out.println("SAIR (0);");
            sn = scan.nextLine();

            if (sn.equals("0")) {
                break;
            } else if (sn.equals("1")) {
                continue;
            } else {
                System.out.println("Comando desconhecido\n");
                break;
            }

        }

    }

}
