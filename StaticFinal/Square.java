/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticFinal;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Square 
{
      public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int result = Square.square(number);

        System.out.println("Square of " + number + " is: " + result);
    }
       static int square(int n)
    {
        return n*n;
    }
}
