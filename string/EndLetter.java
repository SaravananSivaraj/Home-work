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
public class EndLetter 
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String str = sc.nextLine();
        str=str.toLowerCase();
        System.out.print("Enter the Letter: ");
        char lt=sc.next().charAt(0);
        if (str.endsWith(String.valueOf(lt))) 
        {
            System.out.println(str+" It is ends with the Letter "+ lt);
        }
        else 
        {
            System.out.println(str+" It is not end with the Letter "+ lt);
        }
     }
}
