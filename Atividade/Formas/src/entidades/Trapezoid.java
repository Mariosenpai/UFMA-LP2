package entidades;

public class Trapezoid extends Quadrilateral {

    public Trapezoid(Point xy1, Point xy2, Point xy3, Point xy4) {
        super(xy1, xy2, xy3, xy4);
    }

    public boolean eTrapezio() {

        if (xy1.y == xy2.y && xy2.y != xy3.y && xy3.y == xy4.y && xy1.y != xy4.y
                && (xy2.x - xy1.x > xy3.x - xy4.x || xy2.x - xy1.x < xy3.x - xy4.x)) {
            return true;
        } else {
            return false;
        }
    }

    public double areaTrapezio() {
        if (eTrapezio()) {
            double baseMaior = xy2.x - xy1.x;
            double baseMenor = xy3.x - xy4.x;
            double altura = xy3.y - xy2.y;
            double area = ((baseMaior + baseMenor) * altura) / 2;
            return area;
        } else {
            // System.out.println("nao é trapezio");
            return 0;
        }

    }

}
