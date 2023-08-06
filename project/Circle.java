public class Circle extends Shape {
    private double radi;
    private final static double PI = 3.14;

    public Circle(String color, double radi) {
        super(color);
        this.radii = radii;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public double AreaCalc() {
        return 2 * PI * radi * radi;
    }

    public double PeriCalc() {
        return 2 * PI * radi;
    }

    public void display() {
        System.out.println(" color of the Circle is " + color);
    }
}
