package entidades;

public class PessoaFisica extends Contribuinte {

    private String CPF;

    public PessoaFisica(double rendar, double deducao, String CPF) {
        super(rendar, deducao);
        this.CPF = CPF;
    }

    @Override
    public double imposto() {
        double imposto;
        double base = (rendar - deducao);

        if (base <= 0) {
            System.out.println("Error");
            return -1;
        }

        if (base <= 22847.76) {
            return 0;
        } else if (base >= 22847.77 && base <= 33919.8) {
            imposto = base * 0.075;
            return imposto;
        } else if (base >= 33919.81 && base <= 45012.6) {
            imposto = base * 0.15;
            return imposto;
        } else if (base >= 45012.61 && base <= 55976.16) {
            imposto = base * 0.225;
            return imposto;
        } else {
            imposto = base * 0.275;
            return imposto;
        }

    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
