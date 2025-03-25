import java.lang.*;
import java.util.*;
class circle {
   private float radius;
   public circle()
   {
       this.radius=0;
   }
   public circle(float radius)
   {
       this.radius=radius;
   }
   public double getRadius()
   {
       return radius;
   }
   public void setRadius()
   {
       this.radius=radius;
   }
   public double getArea() {
       return Math.PI * radius * radius;
   }
public double getCircumference()
{
   return 2*Math.PI*radius*radius;
}
public static void main(String[] args)
{
   circle d=new circle();
   System.out.println("Default circle radius "+d.getRadius());
   System.out.println("Default circle area "+d.getArea());
   System.out.println("Default circle circumference "+d.getCircumference());
   circle p=new circle(5.0f);
   System.out.println("Parameterized circle radius "+p.getRadius());
   System.out.println("Parameterized circle area "+p.getArea());
   System.out.println("Parameterized circle Circumference "+p.getCircumference());
}
}
