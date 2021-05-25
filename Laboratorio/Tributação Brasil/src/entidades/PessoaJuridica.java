package entidades;

public class PessoaJuridica extends Contribuinte {

    private String CNPJ;

    public PessoaJuridica(double rendar, double deducao, String CNPJ) {
        super(rendar, deducao);
        this.CNPJ = CNPJ;
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

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

}
