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
public class ThrowThrows 
{
 static void checkNumber(int num) throws Exception
    {
        if (num < 0)
        {
            throw new Exception("Number cannot be negative");
        }
        else
        {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try
        {
            checkNumber(number);
        }
        catch (Exception e)
        {           
            System.out.println("Error: " + e.getMessage());
        }
    }    
}
