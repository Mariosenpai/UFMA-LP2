package entidades.empregados;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    // construtor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
            double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double porcVendas = valorVendas * comissao;
        double porcImposto = getImposto() * getSalarioBase();
        double salario = getSalarioBase() + porcVendas - porcImposto;
        return salario;
    }

    // gets sets
    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
