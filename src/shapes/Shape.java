package shapes;

public class Shape {
    protected int height;
    protected int width;

    public Shape(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }


}
