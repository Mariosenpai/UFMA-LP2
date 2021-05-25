package entidades.empregados;

import entidades.Pessoa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // construtor
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
            double imposto) {
        super(nome, endereco, telefone);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.codigoSetor = codigoSetor;
    }

    public double calcularSalario() {
        double porcImposto = this.salarioBase * imposto;
        double salario = this.salarioBase - porcImposto;
        return salario;
    }

    // gets sets
    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

}
