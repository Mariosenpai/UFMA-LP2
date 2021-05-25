package dados;

import java.util.Date;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(double salario, String nome, Date data) {
        super(salario, nome, data);
    }

    @Override
    public double pagamento(Date dataPag) {

        if (dataPag.getMonth() == this.data.getMonth()) {
            salario += salario * 0.02;
            return salario;
        }

        return salario;
    }

}
