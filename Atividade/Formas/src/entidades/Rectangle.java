package entidades;

public class Rectangle extends Quadrilateral {

    public Rectangle(Point xy1, Point xy2, Point xy3, Point xy4) {
        super(xy1, xy2, xy3, xy4);
    }

    public boolean eRetangulo() {
        if (xy1.x != xy2.x && xy1.y == xy2.y && xy2.x == xy3.x && xy2.y != xy3.y && xy3.x != xy4.x && xy3.y == xy4.y
                && xy1.x - xy2.x != xy2.y - xy3.y) {
            return true;
            // System.out.println("é retangulo");
        } else {
            return false;
            // System.out.println("nao é retangulo");
        }

    }

    public double areaRetangulo() {

        if (eRetangulo()) {
            double base = xy1.x - xy2.x;
            double altura = xy2.y - xy3.y;
            double area = base * altura;

            return area;
        } else {
            // System.out.println("nao é retangulo");
        }

        return 0;
    }

}
