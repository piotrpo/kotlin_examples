package pl.com.digita.kotlinexamples.encapsulation;

public class PrintableGeometry implements IGeometry, IPrintableGeometry
{
    public PrintableGeometry(IGeometry geometry, IPrintableGeometry attributes)
    {
        this.geometry = geometry;
        printAttributes = attributes;
    }

    private IGeometry geometry;
    private IPrintableGeometry printAttributes;

    @Override
    public double circumference()
    {
        return geometry.circumference();
    }

    @Override
    public double area()
    {
        return geometry.area();
    }

    @Override
    public int color()
    {
        return printAttributes.color();
    }

    @Override
    public int borderColor()
    {
        return printAttributes.borderColor();
    }
}
