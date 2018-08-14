import java.util.Scanner;
public abstract class Shape{

public abstract double area();
public abstract double perimeter();

public static void main(String[] args) {
  System.out.println("Enter your choice");
  System.out.println("1.Rectangle | 2.Circle")
  Scanner in=new Scanner(System.in);

  input1=in.nextInt();


  switch(input){
  case 1:System.out.println("Enter the length:");
        input2=in.double();
         System.out.println("Enter the width:");
         input3=reader3.next();
         Shape.Rectangle(input3,input2);
  }

}

}
class Rectangle extends Shape{

private double length,width;

public Rectangle(){

  this(1,1);
}
  public Rectangle(double width,double length){

    this.width=width;
    this.length=length;

  }
  @Override
  public double area()
  {
    return width*length;

  }
  @Override
  public double perimeter()
  {
   return 2*(width+length);


  }
   class Circle extends Shape{

    private final double radius;
    final double pi = Math.PI;
    public Circle()
    {
      this(1);
    }
    public Circle(double radius)
    {
     this.radius=radius;
    }
    public double area(){

      return pi*Math.pow(radius,2);
    }
    public double perimeter()
    {
      return 2*pi*radius;
    }
  }
}
