/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Arraylistsum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int choice;
        int sum = 0;

        while (true) 
        {
            System.out.println("1 for Entry 2 for exit");
            choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("Enter the value");
                int value = sc.nextInt();
                list.add(value);
                sum =sum + value;
            } 
            else if (choice == 2) 
            {
                System.out.println("Sum of the values you have entered " + sum);
                break;
            } 
            else 
            {
                System.out.println("Invalid choice");
            }
        }
    }
    
}
