package shapes;

public class Triangle extends Shape {
    int hypotenuse;
    public Triangle(int h, int b, int H) {
        super(b, h);
        this.hypotenuse = H;
    }

    public int getBase() {
        return this.getWidth();
    }

    public int getHypotenuse() {
        return this.hypotenuse;
    }

    public double getTriangleArea() {
        return 0.5 * (double)this.getArea();
    }

    public int getPerimeter() {
        return this.height + this.width + this.hypotenuse;
    }

}
