public class Bicicleta implements CarbonFootPrint {

    public double km;

    public Bicicleta() {
        this.km = 0.0;
    }

    public void obterKM(double km) {
        this.km = km;
    }

    @Override
    public String getCarbonFootPrint() {

        System.out.println("Bicicletas nao produzem pegada de carbono\n");

        return null;
    }

    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
