package entidades;

public abstract class Quadrilateral {

    protected Point xy1;

    protected Point xy2;

    protected Point xy3;

    protected Point xy4;

    public Quadrilateral(Point xy1, Point xy2, Point xy3, Point xy4) {

        this.xy1 = xy1;
        this.xy2 = xy2;
        this.xy3 = xy3;
        this.xy4 = xy4;

    }

    // gets sets

    public Point getXy1() {
        return this.xy1;
    }

    public void setXy1(Point xy1) {
        this.xy1 = xy1;
    }

    public Point getXy2() {
        return this.xy2;
    }

    public void setXy2(Point xy2) {
        this.xy2 = xy2;
    }

    public Point getXy3() {
        return this.xy3;
    }

    public void setXy3(Point xy3) {
        this.xy3 = xy3;
    }

    public Point getXy4() {
        return this.xy4;
    }

    public void setXy4(Point xy4) {
        this.xy4 = xy4;
    }

}
