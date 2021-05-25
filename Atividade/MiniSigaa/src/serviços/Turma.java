package serviços;

import java.util.ArrayList;
import java.util.Random;

import dados.*;

public class Turma {

    private Disciplina disciplina;
    private Docente docente;
    private int id;

    Random idRandom = new Random();

    private ArrayList<Aluno> aluno;

    public Turma(Disciplina disciplina, Docente docente, ArrayList<Aluno> aluno) {

        this.disciplina = disciplina;
        this.docente = docente;
        this.aluno = aluno;
        this.id = idRandom.nextInt(100);

        // adicionando disciplinas
        docente.addDisciplinas(disciplina);

        for (int i = 0; i < aluno.size(); i++) {
            aluno.get(i).addDisciplinas(disciplina);
        }

    }

    public void mostraAlunos() {
        System.out.println("Alunos cadastros na disciplica " + disciplina.getNome() + ":");
        for (int i = 0; i < this.aluno.size(); i++) {
            System.out.println("Nome = " + this.aluno.get(i).getNome() + "\n" + "Matricula = "
                    + this.aluno.get(i).getMatricula() + "\n" + "CPF = " + this.aluno.get(i).getCPF() + "\n");
        }
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Docente getDocente() {
        return this.docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
