package dados;

import java.util.Date;

public class Horista extends Funcionario {
    private double horas;

    public Horista(double salario, String nome, Date data, double horas) {
        super(salario, nome, data);
        this.horas = horas;
    }

    @Override
    public double pagamento(Date data) {
        if (data.getMonth() == this.data.getMonth()) {
            salario += salario * 0.02;
            return salario + (horas * 50);
        }
        return salario + (horas * 50);
    }

    public double getHoras() {
        return this.horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

}
