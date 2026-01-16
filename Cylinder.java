public class Cylinder
{
    private double radius;
    private double height;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }
    public static void main(String[] args)
    {
        Cylinder c = new Cylinder();

        c.setHeight(10);
        c.setRadius(2);

        System.out.println("Radius : "+c.getRadius());
         System.out.println("Height : "+c.getHeight());
    }
}