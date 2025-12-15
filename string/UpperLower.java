/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class UpperLower 
{
    public static void main(String []args)
    {
        String str="Laptop";
        System.out.println("Press 1 for Uppercase");
        System.out.println("Press 2 for Lowercase");
        System.out.print("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) 
        {
            System.out.println("Output: " + str.toUpperCase());
        } 
        else if (choice == 2)
        {
            System.out.println("Output: " + str.toLowerCase());
        }
        else 
        {
            System.out.println("Invalid choice");
        }
    } 
}
