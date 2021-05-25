public class Predio implements CarbonFootPrint {

    private double co2;
    private double ch4;
    private double n2o;

    public Predio() {

        this.co2 = 0.0;
        this.ch4 = 0.0;
        this.n2o = 0.0;

    }

    public void obterCo2(double co2) {
        this.co2 = co2;
    }

    public void obterCh4(double ch4) {
        this.ch4 = ch4;
    }

    public void obterN2o(double n2o) {
        this.n2o = n2o;
    }

    @Override
    public String getCarbonFootPrint() {

        double co2eq = co2 * 1 + ch4 * 28 + n2o * 265;

        System.out.println("A emiciçao de CO2-eq é de " + co2eq + "\n");

        return null;
    }

    // gets
    public double getCo2() {
        return this.co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getCh4() {
        return this.ch4;
    }

    public void setCh4(double ch4) {
        this.ch4 = ch4;
    }

    public double getN20() {
        return this.n2o;
    }

    public void setN20(double n2o) {
        this.n2o = n2o;
    }

}
