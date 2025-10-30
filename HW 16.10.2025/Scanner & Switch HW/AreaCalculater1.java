import java.util.Scanner;

class AreaCalculater1
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Choice");
	System.out.println("1.Circle 2.Square 3.Rectangle 4.Triangle");
	int ch=sc.nextInt();
	
	switch(ch)
	{
		case 1:
		System.out.println("Enter the Radius of the Circle");
		double radius=sc.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("Area of circle is "+  area);
		break;
		
		case 2:
		System.out.println("Enter the side of the square");
		double side=sc.nextDouble();
		double square=side*side;
		System.out.println("Area of Square is "+  square);
		break;
		
		case 3:
		System.out.println("Enter the length of the Rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the Rectangle");
		double width=sc.nextDouble();
		double rectangle=length*width;
		System.out.println("Area of Rectangle is "+  rectangle);
		break;
		
		case 4:
		System.out.println("Enter the base of the Rectangle");
		double base=sc.nextDouble();
		System.out.println("Enter the height of the Rectangle");
		double height=sc.nextDouble();
		double triangle=0.5*base*height;
		System.out.println("Area of Triangle is "+  triangle);
		break;
		
		default:
		System.out.println("given color is invalid");
	}
	}
}