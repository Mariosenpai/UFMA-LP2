package serviços;

import java.util.ArrayList;
import java.util.Scanner;

import dados.*;

public class Mostra {

    Scanner scan = new Scanner(System.in);

    Cadastrar c = new Cadastrar();

    public void mostrarAlunosDis(ArrayList<Aluno> listaA) {

        String numMatricula;

        System.out.println("**********************");
        System.out.println("****Mostra disciplina de um aluno****\n");

        System.out.println("Lista de alunos cadastrados No MiniSigaa:");
        c.alunoList(listaA);

        System.out.println("Qual aluno deseja escolher:(Digite o numero de matricula)");
        numMatricula = scan.nextLine();

        for (int i = 0; i < listaA.size(); i++) {
            if (numMatricula.equals(listaA.get(i).getMatricula())) {
                listaA.get(i).mostraDisciplinas();
            }
        }

    }

    public void mostraDocenteLecio(ArrayList<Docente> listaDoc) {

        String numMat;
        System.out.println("**********************");
        System.out.println("****Mostra disciplina de um docente****\n");

        System.out.println("Lista de Docente cadastrados No MiniSigaa:");
        c.docenteList(listaDoc);

        System.out.println("Qual docente deseja escolher:(Digite o numero de matricula)");
        numMat = scan.nextLine();

        for (int i = 0; i < listaDoc.size(); i++) {
            if (numMat.equals(listaDoc.get(i).getMatricula())) {
                listaDoc.get(i).mostraDisciplinas();
            }
        }

    }

    public void alunosMatrNaTurm(ArrayList<Turma> listTur) {

        int id;
        System.out.println("**********************");
        System.out.println("****ALUNOS MATRICULADO EM UM TURMA X****");
        System.out.println("Turmas cadastradas:");
        for (int i = 0; i < listTur.size(); i++) {
            System.out.println("Disciplica:" + listTur.get(i).getDisciplina().getNome() + "\n" + " Docente:"
                    + listTur.get(i).getDocente().getNome() + "\n" + "ID:" + listTur.get(i).getId());
        }
        System.out.println("Qual turma Deseja escolher: (Digite o ID)");
        id = scan.nextInt();

        for (int i = 0; i < listTur.size(); i++) {
            if (id == listTur.get(i).getId()) {
                listTur.get(i).mostraAlunos();
            }
        }

    }

}
