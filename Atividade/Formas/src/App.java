import entidades.Parallelogram;
import entidades.Point;
import entidades.Rectangle;
import entidades.Square;
import entidades.Trapezoid;

public class App {
    public static void main(String[] args) throws Exception {

        Point xy1 = new Point(1, 1);// Ponto A
        Point xy2 = new Point(6, 1);// Ponto B
        Point xy3 = new Point(3, 4);// Ponto C
        Point xy4 = new Point(1, 4);// Ponto D

        Square q1 = new Square(xy1, xy2, xy3, xy4);
        Rectangle r1 = new Rectangle(xy1, xy2, xy3, xy4);
        Parallelogram p1 = new Parallelogram(xy1, xy2, xy3, xy4);
        Trapezoid t1 = new Trapezoid(xy1, xy2, xy3, xy4);

        if (q1.eQuadrado()) {
            System.out.println("Quadrado:" + q1.areaQuadrado());
        }

        if (r1.eRetangulo()) {
            System.out.println("Retangulo:" + r1.areaRetangulo());
        }

        if (p1.eParalelograma()) {
            System.out.println("Paralelograma:" + p1.areaParalelograma());
        }

        if (t1.eTrapezio()) {
            System.out.println("Trapezio:" + t1.areaTrapezio());
        }

    }
}
