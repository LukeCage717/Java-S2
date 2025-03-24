import java.util.*;
class area
	{
	public double area(double radius)
		{
		return Math.PI*radius*radius;
		}
	public double area(double length,double width)
		{
		return length*width;
		}
	public double area(double base1,double base2,double height)
		{
		return 0.5*(base1+base2)*height;
		}
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		area shape=new area();
		System.out.println("Enter the radius of the circle: ");
		double radius=sc.nextDouble();
		System.out.println("Area of circle: "+shape.area(radius));
		System.out.println("Enter the length of the rectangle: ");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width=sc.nextDouble();
		System.out.println("Area of rectangle: "+shape.area(length,width));
		System.out.println("Enter the first base of the trapezoid: ");
		double base1=sc.nextDouble();
		System.out.println("Enter the second base of the trapezoid: ");
		double base2=sc.nextDouble();
		System.out.println("Enter the height of the trapezoid: ");
		double height=sc.nextDouble();
		System.out.println("Area of trapezoid: "+shape.area(base1,base2,height));
		}
	}
