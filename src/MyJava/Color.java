package src.MyJava;

public class Color {
    protected Color getColor()
    {
        Color s = new Color();
        return s;
    }
}
class Red extends Color{
    protected Color getColor()
    {
        Red s =new Red();
        return s;
    }

}
