package entidades;

public class Square extends Quadrilateral {

    public Square(Point xy1, Point xy2, Point xy3, Point xy4) {
        super(xy1, xy2, xy3, xy4);
    }

    public boolean eQuadrado() {

        if (xy1.x != xy2.x && xy1.y == xy2.y && xy2.x == xy3.x && xy2.y != xy3.y && xy3.x != xy4.x && xy3.y == xy4.y
                && xy1.x - xy2.x == xy2.y - xy3.y) {
            return true;
            // System.out.println("é quadrado");

        } else {
            return false;
            // System.out.println("nao é quadrado");
        }

    }

    public double areaQuadrado() {

        if (eQuadrado()) {
            double base = xy1.x - xy2.x;
            double altura = xy2.y - xy3.y;
            double area = base * altura;

            return area;
        } else {
            // System.out.println("nao é quadrado");
        }

        return 0;
    }

}
