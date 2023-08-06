import java.lang.Math;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double AreaCalc() {
        return 0.5 * base * height;
    }

    public double PeriCalc() {
        double CSide;
        CSide = Math.sqrt((base * base) + (height * height));
        return CSide + base + height;
    }

    public void display() {
        System.out.println(" color of the Triangle is " + color);
    }
}
