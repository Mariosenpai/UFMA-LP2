package entidades.empregados;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    // construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
            double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;

    }

    @Override
    public double calcularSalario() {
        double porcImposto = getSalarioBase() * getImposto();
        double salario = getSalarioBase() + this.ajudaDeCusto - porcImposto;
        return salario;
    }

    // gets sets
    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

}
