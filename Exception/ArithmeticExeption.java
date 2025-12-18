/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArithmeticExeption 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Number cannot devide by zero"); 
        }
    }  
}
