package entidades;

public abstract class Contribuinte {

    protected double rendar;
    protected double deducao;

    public Contribuinte(double rendar, double deducao) {
        this.rendar = rendar;
        this.deducao = deducao;
    }

    public abstract double imposto();

    public double getRendar() {
        return this.rendar;
    }

    public void setRendar(double rendar) {
        this.rendar = rendar;
    }

    public double getDeducao() {
        return this.deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }

}