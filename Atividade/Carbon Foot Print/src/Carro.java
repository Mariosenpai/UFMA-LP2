public class Carro implements CarbonFootPrint {

    private double gasolina;
    private double km;
    private boolean disel;

    public Carro(boolean disel) {
        this.gasolina = 0.0;
        this.km = 0.0;
        this.disel = disel;
    }

    public void qGasolina(double gasolina) {

        this.gasolina = gasolina;

    }

    public void qKM(double km) {

        this.km = km;

    }

    @Override
    public String getCarbonFootPrint() {
        double co2;
        if (disel) {
            co2 = km * 0.83 * 3.7;
            System.out.println("A pegada de CO2 que o carro(gasolina) emitio é de " + co2 + "\n");
        } else {
            co2 = km * 0.82 * 0.75 * 3.7;
            System.out.println("A pegada de CO2 que o carro(disel) emitio é de " + co2 + "\n");

        }

        return null;
    }

    // gets
    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
