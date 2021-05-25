package serviços;

import dados.*;

public class AlunoPorDoc {

    public double alunoPorDocente() {
        double qnt = Aluno.qntAluno / Docente.qntDocente;
        return qnt;
    }

}
