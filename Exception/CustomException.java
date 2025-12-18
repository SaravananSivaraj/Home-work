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
public class CustomException 
{
  static void checkAge(int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        else
        {
            System.out.println("Access granted. Age is valid.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try
        {
            checkAge(age);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}
