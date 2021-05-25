package intface;

import java.util.ArrayList;
import java.util.Scanner;

import serviços.*;
import dados.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner inicia = new Scanner(System.in);

        Cadastrar cadastrar = new Cadastrar();

        Mostra mostra = new Mostra();

        int escolhido = -1;

        AlunoPorDoc alunoPorDoc = new AlunoPorDoc();

        ArrayList<Aluno> listaA = new ArrayList<>();
        ArrayList<Disciplina> listaD = new ArrayList<>();
        ArrayList<Docente> listaDoc = new ArrayList<>();
        ArrayList<Turma> listTur = new ArrayList<>();

        while (true) {
            System.out.println("1 - Cadastra Aluno:\n" + "2 - Cadastrar Disciplina:\n" + "3 - Cadastra Docente:\n"
                    + "4 - Cadastra Turma:\n" + "5 - Mostra todas as Disciplinas Cadastrada Pelo aluno X: \n"
                    + "6 - Mostra as diciplinas que docente X esta lecionando:\n"
                    + "7 - Alunos Matriculados em Uma Turma X\n" + "8 - Quantidade de Aluno por Docente:\n"
                    + "0 - SAIR:");
            escolhido = inicia.nextInt();

            if (escolhido == 0) {
                break;
            }

            // cadastra aluno
            if (escolhido == 1) {

                cadastrar.cadastrarAluno(listaA);

            }

            // cadasta disciplina
            if (escolhido == 2) {

                cadastrar.cadastrarDisciplona(listaD);

            }

            // cadastra docente
            if (escolhido == 3) {

                cadastrar.cadastrarDocente(listaDoc);

            }

            // cadastra turma
            if (escolhido == 4) {

                cadastrar.cadastrarTurma(listaA, listaD, listaDoc, listTur);

            }

            // mostra disciplinas cadastradas pelo aluno x
            if (escolhido == 5) {

                mostra.mostrarAlunosDis(listaA);

            }

            // mostra disciplina lecionanda pelo docente x
            if (escolhido == 6) {

                mostra.mostraDocenteLecio(listaDoc);

            }

            // alunos matriculados em uma turma x
            if (escolhido == 7) {

                mostra.alunosMatrNaTurm(listTur);

            }

            // docente por aluno
            if (escolhido == 8) {
                System.out.println("**********************");
                System.out.println("A quantidade de docente por aluno é de " + alunoPorDoc);

            }

        }

    }
}
