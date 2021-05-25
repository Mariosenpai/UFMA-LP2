package dados;

import java.util.Date;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(double salario, String nome, Date data, double bonus) {
        super(salario, nome, data);
        this.bonus = bonus;
    }

    @Override
    public double pagamento(Date data) {
        if (data.getMonth() == this.data.getMonth()) {
            salario += salario * 0.02;
            return salario + bonus;
        }
        return salario + bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
