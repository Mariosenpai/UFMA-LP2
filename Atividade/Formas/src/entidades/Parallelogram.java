package entidades;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(Point xy1, Point xy2, Point xy3, Point xy4) {
        super(xy1, xy2, xy3, xy4);
    }

    public boolean eParalelograma() {

        if (xy1.x != xy2.x && xy1.y == xy2.y && xy2.x != xy3.x && xy2.y != xy3.y && xy3.x != xy4.x && xy3.y == xy4.y
                && xy4.x != xy1.x && xy4.y != xy1.y && xy2.x - xy1.x == xy3.x - xy4.x
                && xy4.y - xy1.y == xy3.y - xy2.y) {
            return true;
            // System.out.println("é paralelograma");
        } else {
            return false;
            // System.out.println("Nao é paralelograma");
        }
    }

    public double areaParalelograma() {

        if (eParalelograma()) {
            double vert = xy3.y - xy2.y;
            double baseMenor = xy3.x - xy2.x;
            double altura = Math.sqrt((vert * vert) - (baseMenor * baseMenor));
            double base = xy3.x - xy1.x;
            double area = base * altura;
            return area;
        } else {
            return 0;
        }

    }

}
