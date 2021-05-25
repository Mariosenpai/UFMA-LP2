package dados;

import java.util.ArrayList;

public class Docente extends Pessoa {

    private Curso curso;
    private ArrayList<Disciplina> qntDis;

    public static double qntDocente;

    public Docente(String nome, String CPF, String matricula, Curso curso) {
        super(nome, CPF, matricula);
        this.curso = curso;

        this.qntDis = new ArrayList<>();
        Docente.qntDocente++;
    }

    public void addDisciplinas(Disciplina disciplina) {
        this.qntDis.add(disciplina);
    }

    public void mostraDisciplinas() {
        for (int i = 0; i < this.qntDis.size(); i++) {
            System.out.println(this.qntDis.get(i).getNome());
        }
        System.out.println("\n****************************");
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
