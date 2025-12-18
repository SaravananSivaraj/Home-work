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
public class Index 
{
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length :");
       
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+ i +" Index value");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter an index : ");
        int index = sc.nextInt();

        try
        {
            System.out.println("Value at index " + index + " is: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter the available Index.");
        }
    } 
}
