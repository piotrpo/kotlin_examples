package pl.com.digita.kotlinexamples.encapsulation;

public class Rectangle implements IGeometry
{
    private final double side;


    public Rectangle(double side)
    {
        this.side = side;

    }

    @Override
    public double circumference(){
        return 4 * side;
    }

    @Override
    public double area(){
        return side * side;
    }
}
