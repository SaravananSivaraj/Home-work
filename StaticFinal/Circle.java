/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticFinal;

/**
 *
 * @author HP
 */
public class Circle 
{
    final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.calculateArea(8);
    }
 
    void calculateArea(double radius)
    {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }    
}
