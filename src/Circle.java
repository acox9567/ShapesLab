//Kye Davis


public class Circle extends Shape {
    private int radius;

    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return 3.1415 * (radius * radius);
    }
    @Override
    public double getPerimeter()
    {
        return 2 * 3.1415 * radius;
    }
}

