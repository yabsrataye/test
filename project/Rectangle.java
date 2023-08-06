public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double AreaCalc() {
        return length * width;
    }

    public double PeriCalc() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println(" color of the Rectangle is " + color);
    }
}