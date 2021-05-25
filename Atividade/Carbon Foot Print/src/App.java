import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro(true);
        Carro c2 = new Carro(false);

        Predio d = new Predio();

        Bicicleta b = new Bicicleta();

        c1.qGasolina(10);
        c1.qKM(10);

        c2.qGasolina(10);
        c2.qKM(10);

        d.obterCh4(50);
        d.obterCo2(1000);
        d.obterN2o(32);

        b.obterKM(30);

        ArrayList<CarbonFootPrint> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(d);
        list.add(b);

        for (int i = 0; i < list.size(); i++) {

            list.get(i).getCarbonFootPrint();

        }

    }
}
