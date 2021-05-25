package entidades.empregados;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    // construtor
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
            double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double porcImposto = getSalarioBase() * getImposto();
        double porcProducao = valorProducao * this.comissao;
        double salario = getSalarioBase() + porcProducao - porcImposto;
        return salario;
    }

    // gets sets
    public double getValorProducao() {
        return this.valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
