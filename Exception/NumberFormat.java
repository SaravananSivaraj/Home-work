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
public class NumberFormat 
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();   

        try
        {
            int number = Integer.parseInt(input); 
            System.out.println("You entered: " + number);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter numeric values only.");
        }
    } 
}
