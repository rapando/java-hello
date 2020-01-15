import requests.Api;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("\n===============================================\n");

        Api api = new Api();
        api.GETCustomerList();

        System.out.println("\n===============================================\n");

        // do some stuff with Shapes
        Shape rectangle = new Shape(10, 20);
        System.out.print("The rectangle has width = " + rectangle.getWidth());
        System.out.println(" and height = " + rectangle.getHeight());
        System.out.print("The area is " + rectangle.getArea());
        System.out.println(" and the perimeter is " + rectangle.getPerimeter());

        System.out.println("\n===============================================\n");

        Square sq = new Square(21);
        System.out.print("The square has width = " + sq.getWidth());
        System.out.println(" and height = " + sq.getHeight());
        System.out.print("The area is " + sq.getArea());
        System.out.println(" and the perimeter is " + rectangle.getPerimeter());

        System.out.println("\n===============================================\n");

        Triangle tri = new Triangle(3, 4, 5);
        System.out.print("The triangle has base = " + tri.getBase());
        System.out.print(" ,height = " + tri.getHeight());
        System.out.println(" and hypotenuse = " + tri.getHypotenuse());
        System.out.print("The area is " + tri.getTriangleArea());
        System.out.println(" and the perimeter is " + tri.getPerimeter());
    }
}
