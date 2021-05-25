package dados;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private ArrayList<Disciplina> qntDis;

    public static double qntAluno;

    public Aluno(String nome, String CPF, String matricula) {
        super(nome, CPF, matricula);
        this.qntDis = new ArrayList<>();

        Aluno.qntAluno++;
    }

    public void addDisciplinas(Disciplina disciplina) {
        this.qntDis.add(disciplina);
    }

    public void mostraDisciplinas() {
        System.out.println("Aluno: " + this.nome);
        for (int i = 0; i < this.qntDis.size(); i++) {
            System.out.println("Disciplina : " + this.qntDis.get(i).getNome());
        }
    }

}
