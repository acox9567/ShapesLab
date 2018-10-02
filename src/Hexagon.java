//Alexander Cox
//Tuesday, October 2, 2018

public class Hexagon extends Shape {

    private int side;

    public Hexagon(int side) {

        super( "Hexagon");
        this.side = side;
    }

    @Override
    public double getArea() {

        return ((3 * (3 ^ (1/2)) * (side ^ 2)) / 2);
    }

    @Override
    public double getPerimeter() {

        return side * 6;
    }
}

