package pl.com.digita.kotlinexamples.encapsulation;

public class PrintAttributes
{
    private int color;
    private int borderColor;

    public int getColor()
    {
        return color;
    }

    public int getBorderColor()
    {
        return borderColor;
    }

    public PrintAttributes(int color, int borderColor)
    {
        this.color = color;
        this.borderColor = borderColor;


    }
}
