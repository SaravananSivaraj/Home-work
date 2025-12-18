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
public class NestedTryCatch 
{
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
           
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   
            System.out.println("Division Result: " + result);

            try
            {
                
                int[] arr = {10, 20, 30, 40, 50};

                System.out.print("Enter array index (0 to 4): ");
                int index = sc.nextInt();

                System.out.println("Array value: " + arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(" Invalid array index.");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
    }    
}
