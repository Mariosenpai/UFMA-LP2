package dados;

import java.util.Date;

public abstract class Funcionario {

    protected double salario;
    protected String nome;
    protected Date data;

    public Funcionario(double salario, String nome, Date data) {
        this.salario = salario;
        this.nome = nome;
        this.data = data;
    }

    public abstract double pagamento(Date data);

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}