import java.lang.*;
import java.util.*;
class areaOfCircle {
    private float radius;
    public areaOfCircle(float radius)
    {
        this.radius=radius;
    }
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    public double calculateCircumference()
    {
        return 2*Math.PI*radius;
    }
    public void display()
    {
        System.out.println("Area of a circle is "+ calculateArea());
        System.out.println("Circumference of a circle is "+ calculateCircumference());

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius=sc.nextFloat();
        areaOfCircle area=new areaOfCircle(radius);
        area.display();
    }
}
